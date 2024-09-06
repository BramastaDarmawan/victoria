package com.example.My_Everything;

import com.example.My_Everything.Request.CreateUserRequest;
import com.example.My_Everything.Request.UpdateUserRequest;
import com.example.My_Everything.Response.CreateUserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class MyEverythingApplication {

	private List<CreateUserResponse> users = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}


	@GetMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> getById(){
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> masuk(){
		users.add(CreateUserResponse.builder().
				id(1L).name("Bramasta").status("Libur").
				deskripsi("Menara FIF").build());
		users.add(CreateUserResponse.builder().
				id(2L).name("Darmawan").status("Bekerja").
				deskripsi("Menara FIF").build());
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<List<CreateUserResponse>> getUserById(
			@PathVariable("id") Long id
	){
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> createUser(
			@RequestBody CreateUserRequest request
	){
		users.add(CreateUserResponse.builder().id((long) users.size()+1).name(request.getName())
				.status(request.getStatus())
				.deskripsi(request.getDeskripsi()).build());

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
			if(user.getId()==id){
				user.setDeskripsi(request.getDeskripsi());
			}
		}
		return new ResponseEntity<>(users,HttpStatus.OK);
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<List<CreateUserResponse>> deleteUser(
			@RequestBody UpdateUserRequest request,
			@PathVariable("id") Long id
	) {
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
}
