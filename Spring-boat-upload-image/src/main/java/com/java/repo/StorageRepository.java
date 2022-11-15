package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.ImageData;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData,Long> {


    Optional<ImageData> findByName(String fileName);
}
