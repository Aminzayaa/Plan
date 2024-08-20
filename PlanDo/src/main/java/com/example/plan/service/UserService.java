package com.example.plan.service;

import java.util.List;

import com.example.plan.entity.User;


public interface UserService {

	public List<User> findAll();

	public static User authentication(String login_id, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
