package com.foodbox.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodbox.model.Product;
import com.foodbox.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProduct()
	{
		return productRepository.findAll();
	}
	
	public void addProduct(Product product)
	{
		productRepository.save(product);
	}
	
	
	public void deleteProductById(Integer id)
	{
		productRepository.deleteById(id);
	}
	
	public  Optional<Product>  updateProductById(Integer id)
	{
		return productRepository.findById(id);
	}
	
	public List<Product> getAllProductsByCategory(Integer id)
	{
		return productRepository.findAllByCategory_Id(id);
	}
	

}
