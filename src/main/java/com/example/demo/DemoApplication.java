package com.example.demo;

import com.example.demo.Product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Product> hello(){
		return List.of(
				new Product(
						1L,
						"Jacket",
						"Bomber Jacket",
						3
				)
		);
	}
}
