package com.vutheduyet.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vutheduyet.exercise03.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, String> {

}