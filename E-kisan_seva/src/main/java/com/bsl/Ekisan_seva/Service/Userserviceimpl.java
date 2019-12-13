package com.bsl.Ekisan_seva.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsl.Ekisan_seva.daos.Productdao;
import com.bsl.Ekisan_seva.daos.Userdao;
import com.bsl.Ekisan_seva.pojo.Product;
import com.bsl.Ekisan_seva.pojo.User;

@Service
public class Userserviceimpl implements UserService {

	@Autowired
	Userdao dao;
	
	@Autowired
	Productdao productdao;

	@Override
	public User validateUser(String email, String password) {

		return dao.validateUser(email, password);
	}

	@Override
	public boolean registeruser(User user) {

		user = dao.save(user);
		if (user != null)
			return true;

		return false;
	}

	@Override
	public User getuser(String email) {

		User user=dao.getuser(email);
		if(user!=null){
			return user;
		}
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
	 
		return productdao.findAll();
	}

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return productdao.findByName(name);
	}

	@Override
	public boolean addProducttocart(Product product) {
		 
		product=productdao.save(product);
		if(product !=null)
			return true;
		return false;
	}

}
