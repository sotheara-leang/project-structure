package com.example.structure.dao.user;

import javax.validation.Valid;

import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import com.example.structure.base.validator.Validation;
import com.example.structure.domain.user.User;

@Validated
@Repository
public interface UserDAO {

	@Validated(Validation.Create.class)
	int insertUser(@Valid User user);
	
	int updateUser(@Valid User user);
}
