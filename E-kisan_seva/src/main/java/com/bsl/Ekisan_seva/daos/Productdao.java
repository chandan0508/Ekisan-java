package com.bsl.Ekisan_seva.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import org.springframework.transaction.annotation.Transactional;

import com.bsl.Ekisan_seva.pojo.Product;
 
@Repository
public interface Productdao extends JpaRepository<Product, Integer> {
	
	@Query("select p from Product p where p.name = :name")
	public List<Product> findByName(@Param("name") String name);
	
	@Query("update Product p set p.name = :name, p.price = :price , p.information =:information where p.id =:id")
	public List<Product> Update(@Param("name") String name, @Param("price") double price,@Param("information") String information);


@Modifying
@Transactional
@Query(value="UPDATE product SET information = ?, name = ?, price = ? WHERE id = ?;",nativeQuery=true)
public   int updatedValue(String information,String name,double price,int id);
}
