package com.petrofil.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petrofil.courser.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
