package edu.poly.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.shop.model.AccountDto;

@Controller
@RequestMapping("admin")
public class AdminController {
	@GetMapping("index")
	public String index() {
		
		
		return "admin/index";
	}

}
