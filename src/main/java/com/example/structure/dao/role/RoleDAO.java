package com.example.structure.dao.role;

import javax.validation.Valid;

import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import com.example.structure.base.validator.Validation;
import com.example.structure.domain.role.Role;

@Validated
@Repository
public interface RoleDAO {

	@Validated(Validation.Create.class)
	int insertRole(@Valid Role role);
	
	int updateRole(@Valid Role role);
}
