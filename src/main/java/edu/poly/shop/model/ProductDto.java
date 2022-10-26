package edu.poly.shop.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	private Long productId;
	
	private String name;
	
	
	private Integer quantity;
	
	private double unitPrice;
	
	private String image;
	
	
	private MultipartFile imageFile;
	
	private String description;
	
	private Double discount;
	
	private Date enteredDate;
	
	private short status;
	
	private Long categoryId;
	
	
	private Boolean isEdit;

}
