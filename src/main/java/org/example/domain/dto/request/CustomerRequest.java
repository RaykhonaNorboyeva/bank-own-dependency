package org.example.domain.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CustomerRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String secret;
    private String passport;
    private String picture;
}
