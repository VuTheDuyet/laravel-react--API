package com.vutheduyet.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vutheduyet.exercise03.entity.Supply;

public interface SupplyRepository extends JpaRepository<Supply, String> {

}