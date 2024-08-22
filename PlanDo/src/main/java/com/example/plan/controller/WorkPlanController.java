package com.example.plan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.plan.entity.WorkPlan;
import com.example.plan.service.WorkPlanService;


import jakarta.servlet.http.HttpSession;


@Controller
public class WorkPlanController {

	@Autowired
    HttpSession session;

	 @Autowired
	    private WorkPlanService workPlanService;

    
		

	    @GetMapping("/workPlan")
	    public String workPlan(Model model) {
	        List<WorkPlan> workPlanList = workPlanService.findAll();
			/* System.out.print(examList.get(0).getExamId()); */
	        model.addAttribute("workPlanList", workPlanList);
	        return "workPlan";
	    }
		//   @RequestMapping("/edit")
    	// 	public String edit( Model model) {
		// 		List<PerPlan> perPlanList = perPlanService.findAll();
		// 		model.addAttribute("perPlanList", perPlanList);
       	// 	 return "edit";
    	// }
	
	 

}