package com.example.first_application.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter@Setter
public class CreateUserResponse {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;
}
