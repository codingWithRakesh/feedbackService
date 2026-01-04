package com.feedbackServer.feedback_server.service.impl;

import com.feedbackServer.feedback_server.dto.request.FeedBackRequestDto;
import com.feedbackServer.feedback_server.dto.response.FeedBackResponseDto;
import com.feedbackServer.feedback_server.entity.Feedback;
import com.feedbackServer.feedback_server.repository.FeedBackRepository;
import com.feedbackServer.feedback_server.service.FeedBackService;
import com.feedbackServer.feedback_server.service.ImageUploadService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class FeedBackServiceImpl implements FeedBackService {
    private final FeedBackRepository feedBackRepository;
    private final ImageUploadService imageUploadService;

    @Override
    public FeedBackResponseDto createFeedBack(FeedBackRequestDto dto) {
        Map<String,Object> datas;

        Feedback feedback = Feedback.builder()
                .message(dto.getMessage())
                .feedBackType(dto.getFeedBackType())
                .userId(dto.getUserId())
                .build();

        if (dto.getAttachment() != null && !dto.getAttachment().isEmpty()){
            datas = imageUploadService.uploadImage(dto.getAttachment());
            feedback.setAttachment((String) datas.get("fileUrl"));
            feedback.setAttachmentId((String) datas.get("fileId"));
        }

        feedBackRepository.save(feedback);

        return new FeedBackResponseDto(
                feedback.getUserId(),
                feedback.getMessage()
        );
    }
}
