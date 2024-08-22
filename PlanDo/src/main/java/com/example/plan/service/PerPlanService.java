package com.example.plan.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.plan.entity.PerPlan;

@Service
public interface PerPlanService {

	public List<PerPlan> findAll();

    public void perPlan(PerPlan plan);

    public void deletePerPlan(Long planId);

    public void editPerPlan(PerPlan perPlan);
    
    public void addPerPlan(PerPlan perPlan);

}
