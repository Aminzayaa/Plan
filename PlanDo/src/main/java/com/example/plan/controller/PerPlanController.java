package com.example.plan.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.plan.entity.PerPlan;
import com.example.plan.entity.SessionInfo;
import com.example.plan.entity.User;
import com.example.plan.service.PerPlanService;
import com.example.plan.util.ParamUtil;
import jakarta.servlet.http.HttpSession;


@Controller
public class PerPlanController {

	@Autowired
    HttpSession session;

	 @Autowired
	    private PerPlanService perPlanService;
	

	    @GetMapping("/perPlan")
	    public String perPlan(Model model) {

			SessionInfo sessionInfo = ParamUtil.getSessionInfo(session);
        	User loginUser = sessionInfo.getLoginUser();

	        List<PerPlan> perPlanList = perPlanService.findAll();
	        model.addAttribute("perPlanList", perPlanList);
	        return "perPlan";
		}

		 @PostMapping("/delete")
   		 public String deletePlan(@RequestParam("plan_id") int plan_id) {
        	perPlanService.deletePlan(plan_id);
        	return "redirect:/perPlan";
    	}


		@PostMapping("/edit")
		public String editPlan(@RequestParam("plan_id") int planId, Model model) {
			PerPlan plan = perPlanService.findPlanById(planId);
			model.addAttribute("plan", plan);
			return "edit"; // This maps to edit.jsp
		}
	
		// Handle form submission for updating the plan
		@PostMapping("/update")
		public String updatePlan(@ModelAttribute PerPlan perPlan) {
			perPlanService.edit(perPlan);
			return "redirect:/perPlan"; // Redirect back to the list of plans
		}


		@PostMapping("/add")
		public String addPlan(@RequestParam("title") String title,
							  @RequestParam("description") String description,
							  @RequestParam("startDate") LocalDate startDate,
							  @RequestParam("endDate") LocalDate endDate,
							  @RequestParam("status") String status,
							  @RequestParam("user_id") int user_id,  // Ensure this is correctly passed
							  RedirectAttributes redirectAttributes) {
			try {
				PerPlan newPlan = new PerPlan();
				newPlan.setUser_id(user_id);  // Ensure this user_id exists
				newPlan.setTitle(title);
				newPlan.setDescription(description);
				newPlan.setStartDate(startDate);
				newPlan.setEndDate(endDate);
				newPlan.setStatus(status);
	
				perPlanService.addPlan(newPlan);
	
				redirectAttributes.addFlashAttribute("message", "Plan added successfully!");
				return "redirect:/perPlan";
			} catch (Exception e) {
				e.printStackTrace();
				redirectAttributes.addFlashAttribute("error", "An error occurred while adding the plan.");
				return "redirect:/perPlan";
			}
		}


}

