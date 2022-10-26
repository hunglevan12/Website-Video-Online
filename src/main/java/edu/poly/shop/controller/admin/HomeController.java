package edu.poly.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.shop.model.AccountDto;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("/")
	public String index() {			
		return "site/index";
	}
	@RequestMapping("/login")
	public String login() {			
		return "site/accounts/login";
	}
	@RequestMapping("/signup")
	public String signup() {			
		return "site/accounts/signup";
	}
	

}
