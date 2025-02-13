package com.housemate.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housemate.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Cart findByUserId(Long userId);
}
