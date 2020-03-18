package com.perscholas.springboot_basic_web.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.perscholas.springboot_basic_web.models.User;
import com.perscholas.springboot_basic_web.services.UserService;

@Controller
public class HomeController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String showLoginPage() {
		return "Login";
	}
	
	@PostMapping("/loginUser")
	public String loginUser(@RequestParam String email, @RequestParam String password, HttpSession session) {
		User user = userService.findByEmail(email);
		session.setAttribute("currentUser", user);
		return "redirect:/homePage";
	}
	
	@GetMapping("/homePage")
	public String showHomePage() {
		return "HomePage";
	}
	
	@GetMapping("/aboutPage")
	public String showAboutPage() {
		return "AboutPage";
	}
	
	@GetMapping("/newUserForm")
	public String newUserForm(Model model) {
		model.addAttribute("newUser", new User());
		return "NewUserForm";
	}
	
	@PostMapping("/createUser")
	public String createUser(@Valid @ModelAttribute("newUser") User newUser, 
			BindingResult result) {
		if (result.hasErrors()) {
			return "NewUserForm";
		}
		userService.createUser(newUser);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "forward:/";
	}
}