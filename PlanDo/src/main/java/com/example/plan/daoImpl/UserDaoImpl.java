package com.example.plan.daoImpl;

import java.util.List;

import com.example.plan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.plan.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<User> findAll() {
		return jdbcTemplate.query("SELECT * FROM users ORDER BY user_id", new BeanPropertyRowMapper<User>(User.class));
	}

	public User findByLoginIdAndPassword(String login_id, String password) {
		List<User> readList = jdbcTemplate.query(
				"SELECT * FROM users WHERE login_id = :login_id AND password = :password",
				new MapSqlParameterSource().addValue("login_id", login_id).addValue("password", password),
				new BeanPropertyRowMapper<User>(User.class));
		return readList.isEmpty() ? null : readList.get(0);
	}
}