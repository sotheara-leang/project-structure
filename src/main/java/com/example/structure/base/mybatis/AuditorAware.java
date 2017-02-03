package com.example.structure.base.mybatis;

import com.example.structure.domain.user.User;

public class AuditorAware implements com.example.structure.frmk.tool.mybatis.AuditorAware<User> {

	@Override
	public User getCurrentAuditor() {
		User user = new User();
		user.setId(1);
		return user;
	}
}
