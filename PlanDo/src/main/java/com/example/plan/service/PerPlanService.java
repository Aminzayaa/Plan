package com.example.plan.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.plan.entity.PerPlan;

@Service
public interface PerPlanService {

	PerPlanService perPlanDao = null;

    public List<PerPlan> findAll();

    public List<PerPlan> findByUserId(Long plan_id);

    public default List<PerPlan> getAllPlans() {
        return perPlanDao.findAll();
    }
    public void deletePlan(int plan_id);

<<<<<<< HEAD
//    List<PerPlan> findPlansByUserId(Integer user_id);
=======
   
>>>>>>> e2ffcf41e32774883e98fb07b0e746a2ac342681
    public default List<PerPlan> findPlansByUserId(Integer user_id) {
        return perPlanDao.findPlansByUserId(user_id); // Adjust this method call according to your DAO implementation
    }

    PerPlan findPlanById(int plan_id); 
    
    void edit(PerPlan perPlan);

    void addPlan(PerPlan perPlan);

    public void save(PerPlan newPlan);

<<<<<<< HEAD
=======
    
>>>>>>> e2ffcf41e32774883e98fb07b0e746a2ac342681
}