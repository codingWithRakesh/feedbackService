package com.feedbackServer.feedback_server.service.impl;

import com.feedbackServer.feedback_server.repository.FeedBackRepository;
import com.feedbackServer.feedback_server.service.FeedBackService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FeedBackServiceImpl implements FeedBackService {
    private final FeedBackRepository feedBackRepository;
}
