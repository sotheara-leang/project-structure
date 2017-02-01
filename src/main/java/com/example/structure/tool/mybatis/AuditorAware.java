package com.example.structure.tool.mybatis;

import com.example.structure.domain.user.User;

public class AuditorAware implements com.example.structure.base.tool.mybatis.AuditorAware<User> {

	@Override
	public User getCurrentAuditor() {
		User user = new User();
		user.setId(1);
		return user;
	}
}
