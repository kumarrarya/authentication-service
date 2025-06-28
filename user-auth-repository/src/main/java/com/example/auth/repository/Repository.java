package com.example.auth.repository;

import com.example.auth.repository.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<User, Long> {

}
