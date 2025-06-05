package com.yash.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.pms.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}

