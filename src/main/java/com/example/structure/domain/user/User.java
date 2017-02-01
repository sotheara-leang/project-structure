package com.example.structure.domain.user;

import javax.validation.constraints.Size;

import com.example.structure.base.domain.AuditEntity;
import com.example.structure.domain.role.Role;

/**
 * 
 * @author sotheara.leang
 *
 */
public class User extends AuditEntity<Integer, User> {

	private Integer id;
	
	@Size(min = 2, max = 50)
	private String username;
	
	@Size(min = 5, max = 50)
	private String password;
	
	private Role role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	public Integer getRoleId() {
		return role == null ? null : role.getId();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
}
