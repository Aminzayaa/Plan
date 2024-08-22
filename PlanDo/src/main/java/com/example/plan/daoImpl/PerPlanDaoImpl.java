package com.example.plan.daoImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.plan.dao.PerPlanDao;
import com.example.plan.entity.PerPlan;

@Repository
public class PerPlanDaoImpl implements PerPlanDao {

	 @Autowired
	    private NamedParameterJdbcTemplate jdbcTemplate;

	    @Override
	    public List<PerPlan> findAll() {
	        return jdbcTemplate.query("SELECT * FROM perplan ORDER BY user_id",
	                new BeanPropertyRowMapper<PerPlan>(PerPlan.class));
					
	    }
		
    	

}