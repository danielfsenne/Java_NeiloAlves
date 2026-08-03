package com.workshop.demo.repository;

import com.workshop.demo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
