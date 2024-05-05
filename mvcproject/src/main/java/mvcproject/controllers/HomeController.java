//part.1
//package mvcproject.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class HomeController {
//	
//	@RequestMapping("/display")
//	public ModelAndView getPage() {
//		ModelAndView m=new ModelAndView();
//		m.setViewName("welcome");
//		System.out.println("this is welcome page");
//		return m;
//	}
//	
//	@RequestMapping("/home")
//	public ModelAndView getHomePage() {
//		ModelAndView m=new ModelAndView();
//		m.setViewName("home");
//		System.out.println("this is home page");
//		return m;
//	}
//
//}

//part.2
//package mvcproject.controllers;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class HomeController {
//	
//	@RequestMapping("/home")
//	public String home(Model model)
//	{
//		System.out.println("this is home url");
//		model.addAttribute("name","Er. Suman Kr. Singh");
//		model.addAttribute("id", 132);
//		
//		List<String> friends=new ArrayList<String>();
//		friends.add("Shree");
//		friends.add("Devyani");
//		friends.add("Monika");
//		friends.add("ABC");
//		friends.add("Mummy");
//		model.addAttribute("f", friends);
//		
//		return "home";
//	}
//	
//	@RequestMapping("/about")
//	public String about()
//	{
//		System.out.println("this is about controller");
//		return "welcome";
//	}
//
//}

//part.3
package mvcproject.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Er. Suman Kr. Singh");
		model.addAttribute("id", 132);

		List<String> friends = new ArrayList<String>();
		friends.add("Shree");
		friends.add("Devyani");
		friends.add("Monika");
		friends.add("ABC");
		friends.add("Mummy......");
		model.addAttribute("f", friends);

		return "home";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "welcome";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		// creating model and view object
		ModelAndView m = new ModelAndView();

		// setting the data
		m.addObject("name", "Er. Suman DE");
		m.addObject("rn", 40);
		LocalDateTime now = LocalDateTime.now();
		m.addObject("t", now);

		// setting the view name
		m.setViewName("help");
		return m;
	}
}
