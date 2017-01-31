package com.example.structure.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.structure.dao.user.UserDAO;
import com.example.structure.domain.user.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public int insertUser(User user) {
		return userDAO.insertUser(user);
	}

	@Override
	public User selectUser(Integer userId) {
		return null;
	}

	@Override
	public int updateUser(User user) {
		return 0;
	}
}
