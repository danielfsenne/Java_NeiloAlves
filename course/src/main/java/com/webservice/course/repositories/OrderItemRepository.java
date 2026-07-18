package com.webservice.course.repositories;

import com.webservice.course.entities.OrderItem;
import com.webservice.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
