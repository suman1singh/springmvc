package mvcproject.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

// older way : 1st way
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		
//		String email=request.getParameter("email");
//		System.out.println("user email is:" + email);
//		return "";
//	}

	// 2nd way
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("username") String userName,
//			@RequestParam("password") String userPassword, Model model) {
//
//		System.out.println("user email:" + userEmail);
//		System.out.println("user name:" + userName);
//		System.out.println("user password:" + userPassword);
//		//process data here
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
//		return "success";
//	}

	// 3rd way

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("username") String userName,
			@RequestParam("password") String userPassword, Model model) {

		System.out.println("user email:" + userEmail);
		System.out.println("user name:" + userName);
		System.out.println("user password:" + userPassword);
		// process data here
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		return "success";
	}

}
