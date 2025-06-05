package com.yash.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.pms.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
