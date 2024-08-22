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

    public List<PerPlan> findAll() {
        return perPlanDao.findAll();
    }

 
 
}