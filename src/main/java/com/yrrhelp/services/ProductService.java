package com.yrrhelp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.yrrhelp.models.Product;

@Service 
public class ProductService {

	public List<Product> getAllProducts() {
		
		List<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product("1", "Diarymilk Silk", 100.0, 10.0));
		listOfProducts.add(new Product("2", "Vim Liquid", 50.0, 5.0));
		listOfProducts.add(new Product("3", "Britannia Goodday", 20.0, 2.5));
		listOfProducts.add(new Product("4", "Cheese-100g", 150.0, 10.0));
		listOfProducts.add(new Product("5", "Milk", 25.0, 2.5));
		listOfProducts.add(new Product("6", "Surf Excel", 200.0, 12.0));
		listOfProducts.add(new Product("7", "Garnier face wash", 250.0, 5.0));
		listOfProducts.add(new Product("8", "Flour", 300.0, 8.0));
		
		return listOfProducts;
	}

	public Product getProductById(String id) {

		Predicate<Product> byId = p -> p.getId().equals(id);
		return filterProducts(byId);
	}

	public Product filterProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}
}
