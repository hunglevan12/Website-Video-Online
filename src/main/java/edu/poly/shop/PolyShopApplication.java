package edu.poly.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.poly.shop.config.StorageProperties;
import edu.poly.shop.service.StorageService;


@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class PolyShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolyShopApplication.class, args);
	}
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args->{
			storageService.init();
		});
	}
	@Value("${welcome.message}")
	private String message;
	
	@Value("${error.message}")
	private String errorMessage;

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("message", message);

		return "index";
	}

}
