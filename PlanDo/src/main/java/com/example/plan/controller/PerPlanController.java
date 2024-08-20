package com.example.plan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.plan.form.LoginForm;
import com.example.plan.form.PerPlanForm;

@Controller
public class PerPlanController {

	  @GetMapping("/menu")
	    public String getMethodName(Model model) {
	        model.addAttribute("PerPlanForm", new PerPlanForm());
	        return "menu";
	    }
	  @PostMapping("/menu")
	    public String login(@ModelAttribute("loginForm") LoginForm form, Model model) {
	        return "menu";
	    }
}
