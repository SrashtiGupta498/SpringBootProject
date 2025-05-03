package com.greatlearning.BACKEND_WORK.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@EntityScan
@Entity
public class Product_Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	@JsonIgnore
	@Column(updatable = false,nullable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
	@JsonIgnore
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	//@JsonIgnore
	@Override
	public String toString() {
		return "Product_Category [id=" + id + ", name=" + type + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}
	


}