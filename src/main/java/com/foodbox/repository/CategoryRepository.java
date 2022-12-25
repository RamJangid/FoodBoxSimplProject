package com.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbox.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>
{

}
