package com.example.plan.dao;

import java.util.List;

import com.example.plan.entity.PerPlan;

public interface PerPlanDao {

	public List<PerPlan> findAll();

    public void deleteById(Long planId);

    public void save(PerPlan perPlan);
    
}
