package com.feedbackServer.feedback_server.entity;

import com.feedbackServer.feedback_server.entity.type.AuthProviderType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "users")
@Data
@Builder
public class User {

    @Id
    private String id;

    private String email;

    private String name;

    private String avatar;

    private String providerId;

    private AuthProviderType authProviderType;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
