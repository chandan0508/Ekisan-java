package com.bsl.Ekisan_seva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bsl.Ekisan_seva.Service.AdminService;
import com.bsl.Ekisan_seva.Service.UserService;
import com.bsl.Ekisan_seva.pojo.Admin;
import com.bsl.Ekisan_seva.pojo.Product;
import com.bsl.Ekisan_seva.pojo.User;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class Admincontroller {
	@Autowired
	AdminService service;
	@Autowired
	UserService userservice;

	@GetMapping("/api/admin/{email}/{password}")
	public Admin m1(@PathVariable("email") String email, @PathVariable("password") String password) {
		return service.validateAdmin(email, password);
	}
	@GetMapping("/api/admin/view")
	public List<User> m2(){
		return service.getAllUsers();
	}
	@DeleteMapping("/api/admin/delete/{id}")
	public boolean m2(@PathVariable int id){
		service.deleteuser(id);
		return true;
	}
	@PostMapping("/api/admin/product")
	public boolean m3(@RequestBody Product product){
		return service.addproduct(product);
		
	}
	@GetMapping("/api/admin/viewproduct")
	public List<Product> m4(){
		return service.getAllProduct();
	}
	
	@DeleteMapping("/api/admin/deleteproduct/{id}")
	public boolean m5(@PathVariable int id){
		service.deleteproduct(id);
		return true;
		
	}
	@PostMapping("/updated")
	public void updatedValueByAdmin(@RequestBody Product pd)
	{
		service.updatedValueByAdmin(pd);
	}
	 
}
