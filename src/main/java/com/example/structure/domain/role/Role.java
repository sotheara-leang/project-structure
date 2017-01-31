package com.example.structure.domain.role;

import javax.validation.constraints.Size;

/**
 * 
 * @author sotheara.leang
 *
 */
public class Role {

	private Integer id;
	
	@Size(min = 2, max = 50)
	private String name;
	
	@Size(max = 255)
	private String description;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}
