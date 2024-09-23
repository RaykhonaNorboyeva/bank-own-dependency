package org.example.domain.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CustomerResponse {
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String passport;
    private String picture;
}
