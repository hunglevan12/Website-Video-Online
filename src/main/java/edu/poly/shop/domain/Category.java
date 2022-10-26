package edu.poly.shop.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Categories")
public class Category implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CategoryId;
	
	@Column(name= "category_name",length = 100,
			columnDefinition = "nvarchar(100) not null")
	private String name;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL )
	private java.util.Set<Product> products;

}
