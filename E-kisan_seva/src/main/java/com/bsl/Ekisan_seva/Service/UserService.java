package com.bsl.Ekisan_seva.Service;

import java.util.List;

import com.bsl.Ekisan_seva.pojo.Admin;
import com.bsl.Ekisan_seva.pojo.Product;
import com.bsl.Ekisan_seva.pojo.User;
 

public interface UserService{
	
	public User validateUser(String email, String password);
	public boolean registeruser(User user);
	public User getuser(String email);
	public List<Product> getAllProduct();
	public List<Product> findByName(String name);
	public boolean  addProducttocart(Product product);
	
}
