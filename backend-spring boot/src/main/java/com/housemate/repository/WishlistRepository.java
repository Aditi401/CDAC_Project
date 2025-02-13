package com.housemate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housemate.model.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
    Wishlist findByUserId(Long userId);
}
