package com.example.SegalanyaUntukKu;

import com.example.SegalanyaUntukKu.Request.CreateUserRequest;
import com.example.SegalanyaUntukKu.Request.UpdateUserRequest;
import com.example.SegalanyaUntukKu.Response.CreateUserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@SpringBootApplication

public class SegalanyaUntukKuApplication {

	private List<CreateUserResponse> users = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(SegalanyaUntukKuApplication.class, args);
	}

//	@GetMapping
//	public String sayHello(){   // untuk kebutuhan testing
//		return "Hello World";
//	}

	@GetMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> getUser() {
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<List<CreateUserResponse>> getUserById(
			@RequestBody CreateUserRequest request,
			@PathVariable("id") Long id
	) {
		List<CreateUserResponse> data = new ArrayList<>();
		for (CreateUserResponse user : users) {
			if (user.getId() == id) {
				data.add(CreateUserResponse.builder()
						.id(user.getId()).name(user.getName())
						.status(user.getStatus())
						.deskripsi(user.getDeskripsi()).build());
			}
		}
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> createUser(
			@RequestBody CreateUserRequest request
	) {
		if (users.isEmpty()) {
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
		}
		users.add(CreateUserResponse.builder().id((long) users.size() + 1L).
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
//
	@PutMapping("/users/{id}")
	public ResponseEntity<List<CreateUserResponse>> updateUser(
			@RequestBody UpdateUserRequest request,
			@PathVariable("id") Long id
	) {
		for (CreateUserResponse user : users) {
			if (user.getId() == id) {
				user.setName(request.getName());
				user.setDeskripsi(request.getDeskripsi());
				user.setStatus(request.getStatus());
			}
		}
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<List<CreateUserResponse>> deleteuser(
			@PathVariable("id") Long id
	) {
		for (CreateUserResponse data : users) {
			if (data.getId() == id) {
				int nomor = data.getId().intValue();
				users.remove(nomor - 1);
			}
		}

		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/users/ambil")
	public ResponseEntity<List<CreateUserResponse>> getUserByNumber(
			@RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "size", defaultValue = "1") int size
	) {
		int awal = ((page - 1) * size);
		int akhir = awal;
		List<CreateUserResponse> data = new ArrayList<>();

		while (awal < (akhir + size) && awal < users.size()) {
			data.add(users.get(awal));
			awal++;
		}
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
}


