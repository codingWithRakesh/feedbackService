package com.feedbackServer.feedback_server.repository;

import com.feedbackServer.feedback_server.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
