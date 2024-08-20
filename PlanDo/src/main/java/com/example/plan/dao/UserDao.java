package com.example.plan.dao;

import java.util.List;

import com.example.plan.entity.User;


public interface UserDao {

	public List<User> findAll();

	public User findByLoginIdAndPassword(String login_id, String password);
}
