package com.feedbackServer.feedback_server.service.impl;

import com.feedbackServer.feedback_server.repository.UserRepository;
import com.feedbackServer.feedback_server.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


}
