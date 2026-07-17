package com.webservice.course.repositories;

import com.webservice.course.entities.Category;
import com.webservice.course.entities.Product;
import com.webservice.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
