package com.example.structure.service.user;

import com.example.structure.domain.user.User;

public interface UserService {
	
	User selectUser(Integer userId);

	int insertUser(User user);
	
	int updateUser(User user);
}
