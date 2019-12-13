package com.bsl.Ekisan_seva.Service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Service;
import com.bsl.Ekisan_seva.daos.Admindao;
import com.bsl.Ekisan_seva.daos.Productdao;
import com.bsl.Ekisan_seva.daos.Userdao;
import com.bsl.Ekisan_seva.pojo.Admin;
import com.bsl.Ekisan_seva.pojo.Product;
import com.bsl.Ekisan_seva.pojo.User;

@Service
public class AdminServiceimpl implements AdminService {

	@Autowired
	Admindao dao;
	@Autowired
	Userdao userdao;
	@Autowired
	Productdao productdao;


	@Override
	public Admin validateAdmin(String email, String password) {

		return dao.validateAdmin(email, password);
	}

	@Override
	public List<User> getAllUsers() {
		 
		return userdao.findAll();
	}

	@Override
	public void deleteuser(int id) {
		 userdao.delete(userdao.getOne(id));
		
	}

	@Override
	public boolean addproduct(Product product) {
	 product =productdao.save(product);
	 if(product !=null)
		 return true;
		return false;
	}

	@Override
	public List<Product> getAllProduct() {
		 
		return productdao.findAll();
	}

	@Override
	public void deleteproduct(int id) {
		productdao.delete(productdao.getOne(id));
		
	}

	public int updatedValueByAdmin(Product pd)
	 {
		 return productdao.updatedValue(pd.getInformation(),pd.getName(),pd.getPrice(),pd.getId());
	 }

}
