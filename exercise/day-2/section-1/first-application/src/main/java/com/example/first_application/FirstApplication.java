package com.example.first_application;

import com.example.first_application.Request.CreateUserRequest;
import com.example.first_application.Response.CreateUserResponse;
import com.example.first_application.Response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.Builder;

import java.awt.*;
import java.util.*;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

//	@GetMapping
//	public String sayHello(){
//		return "Hello World";
//	}
//
//	@GetMapping("/users")
//	public List<String> getuser(){
//		return List.of("Bram", "Joel", "Yoga");
//	}
//
//	@GetMapping("/users/{id}")
//	public ResponseEntity<Long> getUserById(Long id){
//		return new ResponseEntity<>(id, HttpStatus.OK);
//	}

//	@GetMapping("/users")
//	public ArrayList<GetAssetResponse> asset(){
//		ArrayList<GetAssetResponse> list = new ArrayList<>();
//		GetAssetResponse response1 = GetAssetResponse.builder().id(2323L).fullname("Bramasta").jumlah(50).nama_barang("Laptop").build();
//		GetAssetResponse response2 = GetAssetResponse.builder().id(2452L).fullname("Darmawan").jumlah(40).nama_barang("Hp").build();
//		list.add(response1);
//		list.add(response2);
//		return list;
//	}

//	@GetMapping("/assets/{id}")
//	public GetAssetResponse getAssetById(
//			@PathVariable Long id
//	) {
//		ArrayList<GetAssetResponse> asset = new ArrayList<>();
//		asset.add(GetAssetResponse.builder().id(1L).fullname("John Doe").build());
//		asset.add(GetAssetResponse.builder().id(2L).fullname("John Doe 2").build());
//		asset.add(GetAssetResponse.builder().id(3L).fullname("John Doe 3").build());
//		asset.add(GetAssetResponse.builder().id(4L).fullname("John Doe 4").build());
//		asset.add(GetAssetResponse.builder().id(5L).fullname("John Doe 5").build());
//
//		ArrayList<GetAssetResponse> data = new ArrayList<>();
//
//		for (GetAssetResponse ambil : asset) {
//			if (ambil.getId() <= id) {
//				continue;
//			}
//			data.add(ambil);
//		}
//		return data.get(id.intValue());
//	}

//	@GetMapping("/calculator/add")
//	public String getAdd(
//			@RequestParam(name = "panjang") int panjang,
//			@RequestParam(name = "lebar") int lebar
//	){
//		return String.valueOf(panjang + lebar);
//	}


//	@GetMapping("/assets")
//	public List<GetAssetResponse> getAssetById(
//			@RequestParam(name = "page", defaultValue =  "1")int page,
//			@RequestParam(name = "size", defaultValue =  "1")int size
//	) {
//		List<GetAssetResponse> asset = new ArrayList<GetAssetResponse>();
//		asset.add(GetAssetResponse.builder().id(1L).fullname("John Doe").build());
//		asset.add(GetAssetResponse.builder().id(2L).fullname("John Doe 2").build());
//		asset.add(GetAssetResponse.builder().id(3L).fullname("John Doe 3").build());
//		asset.add(GetAssetResponse.builder().id(4L).fullname("John Doe 4").build());
//		asset.add(GetAssetResponse.builder().id(5L).fullname("John Doe 5").build());
//
//		int start = (page-1) * size;
//		int end = start + size;
//		List<GetAssetResponse> data = new ArrayList<GetAssetResponse>();
//
//		while(start < end){
//			data.add(asset.get(start));
//		}
//		return data;
//		if (end > asset.size()) {
//			return null;
//		}
//		return asset.subList(start, end);
//
//
//
//	}

	@PostMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> createUser(
			@RequestBody CreateUserRequest request){

		List<CreateUserResponse> list = new ArrayList<>();

		list.add(CreateUserResponse.builder().id(1L).name("AB").build());
		list.add(CreateUserResponse.builder().id(2L).name("DC").build());
		list.add(CreateUserResponse.builder().id(request.getId()).name(request.getName()).build());

		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
