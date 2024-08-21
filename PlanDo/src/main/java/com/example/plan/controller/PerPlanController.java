package com.example.plan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.plan.entity.PerPlan;
import com.example.plan.service.PerPlanService;


import jakarta.servlet.http.HttpSession;


@Controller
public class PerPlanController {

	@Autowired
    HttpSession session;

	 @Autowired
	    private PerPlanService perPlanService;
		

	    @GetMapping("/perPlan")
	    public String perPlan(Model model) {
	        List<PerPlan> perPlanList = perPlanService.findAll();
			/* System.out.print(examList.get(0).getExamId()); */
	        model.addAttribute("perPlanList", perPlanList);
	        return "perPlan";
	    }
		  @RequestMapping("/edit")
    		public String edit( Model model) {
				List<PerPlan> perPlanList = perPlanService.findAll();
				model.addAttribute("perPlanList", perPlanList);
       		 return "edit";
    	}
	
	 

}
