package com.example.plan.daoImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.plan.dao.WorkPlanDao;
import com.example.plan.entity.WorkPlan;

@Repository
public class WorkPlanDaoImpl implements WorkPlanDao {

	 @Autowired
	    private NamedParameterJdbcTemplate jdbcTemplate;

	    @Override
	    public List<WorkPlan> findAll() {
	        return jdbcTemplate.query("SELECT * FROM workplan ORDER BY plan_id",
	                new BeanPropertyRowMapper<WorkPlan>(WorkPlan.class));
					
	    }
		
    	

}