package com.petrofil.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petrofil.courser.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
