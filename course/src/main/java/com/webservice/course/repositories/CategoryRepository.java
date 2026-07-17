package com.webservice.course.repositories;

import com.webservice.course.entities.Category;
import com.webservice.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
