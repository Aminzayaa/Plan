package com.example.plan.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.plan.entity.PerPlan;

@Service
public interface PerPlanService {

	public List<PerPlan> findAll();
    

}
