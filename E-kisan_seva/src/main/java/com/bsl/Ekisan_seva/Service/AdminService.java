package com.bsl.Ekisan_seva.Service;

import java.util.List;

import com.bsl.Ekisan_seva.pojo.Admin;
import com.bsl.Ekisan_seva.pojo.Product;
import com.bsl.Ekisan_seva.pojo.User;

public interface AdminService {

	public Admin validateAdmin(String email,String password);
	public List<User> getAllUsers();
	public void deleteuser(int id);
	public boolean addproduct(Product product);
	public List<Product> getAllProduct();
	public void deleteproduct(int id);
	public int updatedValueByAdmin(Product pd);
 
}
