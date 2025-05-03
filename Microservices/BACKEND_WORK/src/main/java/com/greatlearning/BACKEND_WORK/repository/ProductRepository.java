
package com.greatlearning.BACKEND_WORK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.BACKEND_WORK.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository < Product, Long > { 
}
