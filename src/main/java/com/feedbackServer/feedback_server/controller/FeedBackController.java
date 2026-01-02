package com.feedbackServer.feedback_server.controller;

import com.feedbackServer.feedback_server.service.FeedBackService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback")
@AllArgsConstructor
public class FeedBackController {
    private final FeedBackService feedBackService;

}
