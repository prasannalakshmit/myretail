package io.springbootstarter.product;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	private List<Product> products = Arrays.asList(
			new Product("13860428","The Big Lebowski (Blu-ray) (Widescreen)","Widescreen"),
			new Product("13860445","Core Java","Core Java Description"),
			new Product("32260428","Java Script","Java Script Description")
			);

	public List<Product> getAllProducts(){
		return products;
	}
	
	public Product getProduct(String id) {
		return products.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}

}
