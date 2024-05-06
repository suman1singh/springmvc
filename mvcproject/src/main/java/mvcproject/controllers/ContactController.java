package mvcproject.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvcproject.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "learn code with durgesh");
		m.addAttribute("Desc", "I am learning Spring MVC");
		System.out.println("adding common data to model");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("creating form");
		return "contact";
	}

	// older way : 1st way
	// @RequestMapping(path = "/processform", method = RequestMethod.POST)
	// public String handleForm(HttpServletRequest request) {
	//
	// String email=request.getParameter("email");
	// System.out.println("user email is:" + email);
	// return "";
	// }

	// 2nd way
	// @RequestMapping(path = "/processform", method = RequestMethod.POST)
	// public String handleForm(@RequestParam("email") String userEmail,
	// @RequestParam("username") String userName,
	// @RequestParam("password") String userPassword, Model model) {
	//
	// System.out.println("user email:" + userEmail);
	// System.out.println("user name:" + userName);
	// System.out.println("user password:" + userPassword);
	// //process data here
	// model.addAttribute("name", userName);
	// model.addAttribute("email", userEmail);
	// model.addAttribute("password", userPassword);
	// return "success";
	// }

	// 3rd way
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(
//			@RequestParam("email") String userEmail, 
//			@RequestParam("username") String userName,
//			@RequestParam("password") String userPassword, 
//			Model model) {
//
//			User user = new User();
//			user.setEmail(userEmail);
//			user.setUsername(userName);
//			user.setPassword(userPassword);
//	
//			System.out.println(user);
//			// process data here
//			// model.addAttribute("name", userName);
//			// model.addAttribute("email", userEmail);
//			// model.addAttribute("password", userPassword);
//			model.addAttribute("user", user);
//			return "success";
//	}
	// 4th way: using ModelAttribute annotation
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		return "success";
	}

}
