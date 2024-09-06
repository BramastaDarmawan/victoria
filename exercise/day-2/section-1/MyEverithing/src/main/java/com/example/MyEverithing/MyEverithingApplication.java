package com.example.MyEverithing;

import com.example.MyEverithing.Request.CreateUserRequest;
import com.example.MyEverithing.Request.UpdateUserRequest;
import com.example.MyEverithing.Response.CreateUserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyEverithingApplication {

	private List<CreateUserResponse> users = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(MyEverithingApplication.class, args);
	}

	@PostMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> createUser(
			@RequestBody CreateUserRequest request
	){
		users.add(CreateUserResponse.builder().id((long) users.size()+1).name(request.getName()).build());

		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PostMapping("/users/{id}")
	public ResponseEntity<List<CreateUserResponse>> updateUser(
			@RequestBody UpdateUserRequest request,
			@PathVariable("id") Long id
	){
		for(CreateUserResponse user : users){
			if(user.getId()==id){
				user.setName(request.getName());
			}
			if(user.getId()==id){
				user.setStatus(request.getStatus());
			}
			if(user.getId()==0){
				user.setDeskripsi(request.getDeskripsi());
			}
		}
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
}
