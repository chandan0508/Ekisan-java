package com.bsl.Ekisan_seva.controller;

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bsl.Ekisan_seva.Service.UserService;
import com.bsl.Ekisan_seva.pojo.Product;
import com.bsl.Ekisan_seva.pojo.User;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class Usercontroller {

	@Autowired
	UserService service;

	@GetMapping("/api/user/{email}/{password}")
	public User m1(@PathVariable("email") String email, @PathVariable("password") String password) {
		return service.validateUser(email, password);
	}

	@PostMapping("/api/user")
	public boolean m2(@RequestBody User user) {
		return service.registeruser(user);

	}
	
	@GetMapping("/api/user/{email}")
	public User m3(@PathVariable("email") String email){
		return service.getuser(email);
		
	}
	@GetMapping("/api/user/viewproduct")
	public List<Product> m4(){
		return service.getAllProduct();
	}
	@GetMapping("/api/user/name/{name}")
	public List<Product> m5(@PathVariable String name){
		return service.findByName(name);
	}
	@PostMapping("/api/user/addproducttocart")
	public boolean m6(@RequestBody Product product){
		return service.addProducttocart(product);
}
}