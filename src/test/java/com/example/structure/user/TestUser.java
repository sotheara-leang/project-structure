package com.example.structure.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.structure.AbstractTestCase;
import com.example.structure.domain.role.Role;
import com.example.structure.domain.user.User;
import com.example.structure.service.user.UserService;

public class TestUser extends AbstractTestCase {

	@Autowired
	UserService userService;

	@Transactional
	@Test
	public void doTest() {
		Role role = new Role();
		role.setId(1);
		
		User user = new User();
		user.setUsername("AAAA");
		user.setPassword("12345");
		user.setRole(role);
		
		userService.insertUser(user);
		
		System.out.println(user);
	}
}
