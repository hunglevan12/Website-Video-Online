package edu.poly.shop.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
	private int customerId;
	private String name;
	private String email;
	private String username;
	private String password;
	private String phone;
	private Date registeredDate;
	private short status;

}
