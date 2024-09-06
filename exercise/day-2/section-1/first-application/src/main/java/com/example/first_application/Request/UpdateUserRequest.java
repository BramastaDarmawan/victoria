package com.example.first_application.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class UpdateUserRequest {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;
}
