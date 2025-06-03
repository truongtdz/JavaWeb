package com.sportshop.sportshop.repository;

import com.sportshop.sportshop.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long> {
    BrandEntity getBrandById(Long brandId);

    boolean existsByName(String name);

    Optional<BrandEntity> findByName(String name);
}
