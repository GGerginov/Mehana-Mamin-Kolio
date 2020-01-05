package com.gerginov.demo.repository;

import com.gerginov.demo.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {


}
