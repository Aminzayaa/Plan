package com.example.plan.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.plan.dao.WorkPlanDao;
import com.example.plan.entity.WorkPlan;
import com.example.plan.service.WorkPlanService;

@Service
public class WorkPlanServiceImpl implements WorkPlanService {

	@Autowired
    private WorkPlanDao workPlanDao;

    public List<WorkPlan> findAll() {
        return workPlanDao.findAll();
    }

 
 
}
