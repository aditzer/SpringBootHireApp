package com.aditi.joblisting.repository;

import com.aditi.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
