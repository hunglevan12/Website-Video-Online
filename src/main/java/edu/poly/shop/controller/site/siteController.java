package edu.poly.shop.controller.site;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("site")
public class siteController {
	@GetMapping("index")
	public String index() {
		
		return "site/index";
		
	}
    
	@GetMapping("contact")
	public String contact() {

		return "site/contact";

	}
	
	@GetMapping("categories")
	public String categories() {

		return "site/categories";

	}
	
	@GetMapping("single")
	public String single() {

		return "site/single";

	}

}
