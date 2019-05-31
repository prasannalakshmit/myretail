package io.springbootstarter.product;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.TomcatPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
		
	}
	@RequestMapping("/products/{id}")
	public Product getProduct(@PathVariable String id) {
		return productService.getProduct(id);
	}
}
