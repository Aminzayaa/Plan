package com.example.plan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.plan.entity.PerPlan;
import com.example.plan.form.PerPlanForm;
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
				@PostMapping("/add")
				public String addPlan(@ModelAttribute PerPlan perPlan, Model model) {
				perPlanService.addPerPlan(perPlan);
				// After adding, redirect to the same page to refresh the list
				return "redirect:/perPlan";
			}

			@PostMapping("/edit")
			public String editPlan(@ModelAttribute PerPlan perPlan, Model model) {
				perPlanService.editPerPlan(perPlan);
				return "redirect:/perPlan";
			}

			@PostMapping("/delete")
			public String deletePlan(@RequestParam("planId") Long planId, Model model) {
				perPlanService.deletePerPlan(planId);
				return "redirect:/perPlan";
			}
		
	
	 

}
