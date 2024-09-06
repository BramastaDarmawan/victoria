package com.example.first_application;

import com.example.first_application.Response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import lombok.Builder;

import java.awt.*;
import java.util.ArrayList;

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

	@GetMapping("/assets/{id}")
	public GetAssetResponse getAssetById(
			@PathVariable Long id
	){
		return GetAssetResponse.builder().id(id).fullname("Bram").build();
	}

}
