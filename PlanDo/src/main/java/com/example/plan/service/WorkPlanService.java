package com.example.plan.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.plan.entity.WorkPlan;

@Service
public interface WorkPlanService {

	public List<WorkPlan> findAll();
    

}
