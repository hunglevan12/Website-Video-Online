package edu.poly.shop.controller.admin;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.poly.shop.domain.Account;
import edu.poly.shop.model.AdminLoginDto;
import edu.poly.shop.service.AccountService;

@Controller
public class SiteLoginController {
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private HttpSession session;
	
	@GetMapping("login")
	public String login (ModelMap model) {
		model.addAttribute("account", new AdminLoginDto());
		return "/site/accounts/login";
		
	}
	@PostMapping("login")
	public ModelAndView login(ModelMap model,
	        @Valid @ModelAttribute("account")AdminLoginDto dto,
	        BindingResult result){
	    if(result.hasErrors()){
	        return new ModelAndView("/site/accounts/login",model);
	   }
	   Account account= accountService.login(dto.getUsername(),dto.getPassword());
	   
	   if(account == null) {
		   model.addAttribute("message","invalid username or password");
		   return new ModelAndView("/site/accounts/login",model);
	   }
	   Object ruri=session.getAttribute("redirect-uri");
	   
	   if(ruri!=null){
		   session.removeAttribute("redirect-uri");
	       return new ModelAndView("redirect:"+ruri);
	   }
	       
	       
		   return new ModelAndView("redirect:/site/index", model);
			                                    	                                    
	}

}
