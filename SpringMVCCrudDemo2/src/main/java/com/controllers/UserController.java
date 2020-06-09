package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beans.User;
import com.dao.Userdao;

@Controller
public class UserController {
	@Autowired
	Userdao dao;

	@RequestMapping("/Login")
	public String show(Model m) {
		m.addAttribute("command", new User());
		return "Login";
	}
	@RequestMapping("/View")
	public String view(Model m) {
		List<User> list = dao.getUser();
		m.addAttribute("list", list);
		return "View";
	}
}
