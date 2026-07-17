package com.webservice.course.config;

import com.webservice.course.entities.Order;
import com.webservice.course.entities.User;
import com.webservice.course.entities.enums.OrderStatus;
import com.webservice.course.repositories.OrderRepository;
import com.webservice.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "João Brown", "joao@gmail.com", "98777777", "123457");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-20T19:42:10Z"),u2, OrderStatus.WAITING_PAYMENT);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2));
    }
}
