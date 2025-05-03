package com.greatlearning.BACKEND_WORK.entity;

import java.time.LocalDateTime;


import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.Entity;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@EntityScan
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private String color;
	private long price;
	@OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.REMOVE})
	private ProductInventory inventory;
	private String image;
	@ManyToOne(targetEntity=Product_Category.class ,cascade = CascadeType.ALL)
	private Product_Category category;
	@JsonIgnore
	@Column(updatable = false,nullable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
	@JsonIgnore
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	//@JsonIgnore
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private ProductBrand brand;
	@Column(name = "sales",columnDefinition ="bigimt default 0")
	private long sales;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", color=" + color + ", price="
				+ price + ", inventory=" + inventory + ", image=" + image + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt+ "]";
	}
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	 
	
	
	
	
	

}