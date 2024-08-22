package com.example.plan.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.plan.dao.PerPlanDao;
import com.example.plan.entity.PerPlan;
import com.example.plan.service.PerPlanService;

@Service
public class PerPlanServiceImpl implements PerPlanService {

	@Autowired
    private PerPlanDao perPlanDao;

    @Override
    public void addPerPlan(PerPlan perPlan) {
        perPlanDao.save(perPlan);
    }

    @Override
    public void editPerPlan(PerPlan perPlan) {
        perPlanDao.save(perPlan); // Assuming save() works for both add and update
    }

    @Override
    public void deletePerPlan(Long planId) {
        perPlanDao.deleteById(planId);
    }

    @Override
    public List<PerPlan> findAll() {
        return perPlanDao.findAll();
    }

    @Override
    public void perPlan(PerPlan plan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perPlan'");
    }
    
 
 
}
