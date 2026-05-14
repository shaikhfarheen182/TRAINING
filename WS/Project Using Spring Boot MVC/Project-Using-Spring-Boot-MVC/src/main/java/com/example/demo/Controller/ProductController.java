package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductService productService ;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		System.out.println("all products"); 
		return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
	}
	
	
	@GetMapping("/productById/{id}")
	public ResponseEntity<Product>getProductById(@PathVariable int id){
				
		System.out.println("product by id");
		Product product = productService.getProductById(id);
		if(product.getId()>0)
			return new ResponseEntity<>(product,HttpStatus.OK);
		else {
			return new ResponseEntity<>(product,HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/productPostingorUpdating")
	public ResponseEntity<?>addorUpdateProduct(@RequestPart Product product,@RequestPart MultipartFile imageFile){
		Product savedProduct = null;
   try {
		savedProduct = productService.addProduct(product,imageFile);
		return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
	}catch(IOException e ) {
		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
//	@PutMapping("/productupdate/{id}")
//	public ResponseEntity<String> updateProduct(@PathVariable int id ,@RequestPart Product product,@RequestPart MultipartFile imageFile){
//		Product updatedProduct = null;
//		try {
//			updatedProduct = productService.updateProduct(product,imageFile);
//			return new ResponseEntity<>("Updated",HttpStatus.OK);
//		}catch(IOException e ) {
//			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
//			}
//		
//		}
	
	
	@DeleteMapping("/productdelete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id){
		Product product = productService.getProductById(id);
		if(product != null) {
			productService.deleteProduct(id);
			return new ResponseEntity<>("deleted",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("NOT FOUND",HttpStatus.NOT_FOUND);
		}
	}

	
	@GetMapping("/productsearch/{keyword}")
	public ResponseEntity<List<Product>> searchProducts(@PathVariable String keyword) {
	    System.out.println("SEARCH API HIT: " + keyword);
	    List<Product> products = productService.searchProducts(keyword);
	    return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
}