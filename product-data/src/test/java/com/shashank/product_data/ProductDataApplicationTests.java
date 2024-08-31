package com.shashank.product_data;

import com.shashank.product_data.entity.Product;
import com.shashank.product_data.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProductDataApplicationTests {

	@Autowired
	private ProductRepository productRepository;

	@Test
	void testCreateProduct() {
		Product product = new Product();
		product.setName("Iphone");
		product.setDescription("Awesome");
		product.setPrice(1000);
		productRepository.save(product);

		Product product1 = new Product();
		product1.setName("Ipad");
		product1.setDescription("Good");
		product1.setPrice(800);
		productRepository.save(product1);
	}

	@Test
	void testRead() {
		Product product = productRepository.findById(1).get();
		assertNotNull(product);
		assertEquals("Iphone", product.getName());
	}

	@Test
	void testUpdate() {
		Product product = productRepository.findById(1).get();
		product.setPrice(1200);
		productRepository.save(product);
	}

	@Test
	void testDelete() {
		if(productRepository.existsById(1)) {
			System.out.println("Deleting a product");
			productRepository.deleteById(1);
		}
	}

	@Test
	void testCount() {
		System.out.println("Total Records: "+productRepository.count());
	}

}
