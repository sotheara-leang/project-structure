package com.example.structure.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.structure.domain.user.User;

@Controller
@RequestMapping("/users")
public class UserController {

	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String insertUser(User user) {
		return "SUCCESS";
	}
}
