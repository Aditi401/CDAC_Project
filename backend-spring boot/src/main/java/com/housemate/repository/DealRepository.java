package com.housemate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housemate.model.Deal;

public interface DealRepository extends JpaRepository<Deal,Long> {

}
