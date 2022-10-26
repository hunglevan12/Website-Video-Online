package edu.poly.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.poly.shop.domain.Account;
import edu.poly.shop.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
