package com.example.SegalanyaUntukKu;

import com.example.SegalanyaUntukKu.Request.CreateUserRequest;
import com.example.SegalanyaUntukKu.Request.UpdateUserRequest;
import com.example.SegalanyaUntukKu.Response.CreateUserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SegalanyaUntukKuApplication {

	private List<CreateUserResponse> users = new ArrayList<>();
	private List<CreateUserResponse> data = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(SegalanyaUntukKuApplication.class, args);
	}

	@GetMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> getuser(){
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<List<CreateUserResponse>> getUserById()
	{
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> createUser(
			@RequestBody CreateUserRequest request
	){
		users.add(CreateUserResponse.builder().id(1L).name("Dewa").
				status("Bekerja").deskripsi("Menara FIF").
				build());
		users.add(CreateUserResponse.builder().id(2L).name("Gede").
				status("Liburan").deskripsi("Bali").
				build());
		users.add(CreateUserResponse.builder().id(3L).name("Ngurah").
				status("Bekerja").deskripsi("Menara FIF").
				build());
		users.add(CreateUserResponse.builder().id(4L).name("Bramasta").
				status("Liburan").deskripsi("Bali").
				build());
		users.add(CreateUserResponse.builder().id(5L).name("Darmawan").
				status("Bekerja").deskripsi("Menara FIF").
				build());
		users.add(CreateUserResponse.builder().id((long) users.size()+1).
				name(request.getName()).status(request.getStatus()).
				deskripsi(request.getDeskripsi()).build());

		return new ResponseEntity<>(users, HttpStatus.OK);
	}

//	@PostMapping("/users")
//	public ResponseEntity<List<CreateUserResponse>> updateUser(
//			@RequestBody CreateUserRequest request
//	){
//		users.add(CreateUserResponse.builder().id((long) users.size()+1).
//				name(request.getName()).status(request.getStatus()).
//				deskripsi(request.getDeskripsi()).build());
//
//		return new ResponseEntity<>(users, HttpStatus.OK);
//	}

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
	public ResponseEntity<List<CreateUserResponse>> deleteuser(
			@RequestBody CreateUserRequest delete,
			@PathVariable("id") Long id
	){
		for(CreateUserResponse user : users){
			if(user.getId()!=id){
				data.add(user);
			}
		}return new  ResponseEntity<>(data,HttpStatus.OK);
	}
}

