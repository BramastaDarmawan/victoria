package com.example.latihan;

import com.example.first_application.Request.CreateUserRequest;
import com.example.first_application.Request.EmployeeUserRequest;
import com.example.first_application.Request.UpdateUserRequest;
import com.example.first_application.Response.CreateUserResponse;
import com.example.first_application.Response.EmployeeUserResponse;
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
	private List<CreateUserResponse> users = new ArrayList<>();
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
//	public List<GetAssetResponse> getAssetById(
//			@PathVariable Long id
//	) {
//		List<GetAssetResponse> asset = new ArrayList<>();
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
//		return data;
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
//	}

//	@PostMapping("/users")
//	public ResponseEntity<List<CreateUserResponse>> createUser(
//			@RequestBody CreateUserRequest request){
//
//		List<CreateUserResponse> list = new ArrayList<>();
//
//		list.add(CreateUserResponse.builder().id(1L).name("AB").build());
//		list.add(CreateUserResponse.builder().id(2L).name("DC").build());
//		list.add(CreateUserResponse.builder().id(request.getId()).name(request.getName()).build());
//
//		return new ResponseEntity<>(list, HttpStatus.OK);
//	}

//	@PostMapping("/employees")
//	public ResponseEntity<List<EmployeeUserResponse>> createEmployee(
//			@RequestBody EmployeeUserRequest request){
//
//		List<EmployeeUserResponse> list = new ArrayList<>();
//
//		list.add(EmployeeUserResponse.builder().name("Bram").age(23).phone("0811111").build());
//		list.add(EmployeeUserResponse.builder().id(2).name("Bram").age(23).phone("0811111").build());
//		list.add(EmployeeUserResponse.builder().id(3).age(23).phone("0811111").build());
//		list.add(EmployeeUserResponse.builder().id(4).name("Bram").age(23).phone("0811111").build());
//		list.add(EmployeeUserResponse.builder().id(5).name("Bram").phone("0811111").build());
//		list.add(EmployeeUserResponse.builder().id(6).name("Bram").age(23).build());
//
//		List<EmployeeUserResponse> data = new ArrayList<>();
//		for (EmployeeUserResponse pekerja : list){
//			if(pekerja.getId() == 0){
//				if (pekerja.getName().equalsIgnoreCase("null")){
//					if (pekerja.getAge() == 0){
//						if (pekerja.getPhone().equalsIgnoreCase("null")){
//							continue;
//						}
//					}
//				}
//			}
//			else {
//				data.add(EmployeeUserResponse.builder().id(request.getId()).name(request.getName()).age(request.getAge()).phone(request.getPhone()).build());
//			}
//			data.add(pekerja);
//		}
//		return new ResponseEntity<>(data, HttpStatus.OK);
//	}

//	@PostMapping("/users")
//	public ResponseEntity<List<CreateUserResponse>> createUser(
//			@RequestBody CreateUserRequest request
//	){
//		users.add(CreateUserResponse.builder().id((long) users.size()+1).name(request.getName()).build());
//
//		return new ResponseEntity<>(users, HttpStatus.OK);
//	}
//
//	@PostMapping("/users/{id}")
//	public ResponseEntity<List<CreateUserResponse>> updateUser(
//			@RequestBody UpdateUserRequest request,
//			@PathVariable("id") Long id
//	){
//		for(CreateUserResponse user : users){
//			if(user.getId()==id){
//				user.setName(request.getName());
//			}
//			if(user.getId()==id){
//				user.setStatus(request.getStatus());
//			}
//			if(user.getId()==0){
//				user.setDescription(request.getDescription());
//			}
//		}
//		return new ResponseEntity<>(users,HttpStatus.OK);
//	}

}
