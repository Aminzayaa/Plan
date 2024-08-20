package com.example.plan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.plan.form.LoginForm;
import com.example.plan.service.UserService;

import jakarta.servlet.http.HttpSession;

import com.example.plan.entity.SessionInfo;
import com.example.plan.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.plan.util.ParamUtil;

@Controller
public class AuthController {
    @Autowired
    private UserService userService;
    
    @Autowired
    HttpSession session;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @PostMapping("/login")
    public String handleLoginForm(LoginForm loginForm, Model model) {
        User user = userService.authentication(loginForm.getLogin_id(), loginForm.getPassword());
        if (user != null) {
            SessionInfo sessionInfo = ParamUtil.getSessionInfo(session);
            sessionInfo.setLoginUser(user);
            session.setAttribute("sessionInfo", sessionInfo);
            model.addAttribute("user", user);
            return "redirect:/menu";
        } else {
            model.addAttribute("errMsg", "Invalid login Id or Password");
            return "login";
        }
    }

    @PostMapping("/logout") // Updated to handle POST requests
    public String logout() {
        session.invalidate();
        return "redirect:/login";
    }

    @GetMapping("/menu")
    public String menu(Model model) {
        return "menu";
    }
}

