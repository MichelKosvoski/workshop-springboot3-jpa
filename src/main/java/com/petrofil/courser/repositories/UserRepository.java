package com.petrofil.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petrofil.courser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
