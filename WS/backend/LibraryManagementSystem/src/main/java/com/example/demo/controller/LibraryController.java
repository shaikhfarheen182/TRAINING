package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.BookPost;
import com.example.demo.service.LibraryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LibraryController {

	@Autowired
	private LibraryService  service;


	
	
	@GetMapping("/books")
	public List<BookPost> getAllBooks(){
		System.out.println("get all books");
		 return service.getAllBooks();
		
	}
	

   
	@GetMapping("/books/{isbn}")
	public BookPost getBookByIsbn(@PathVariable   String isbn){
		System.out.println("get all books by isbn");
		 return service.getBookByIsbn(isbn);
		
	}
	
	
	@GetMapping("/BookPost/author/{author}")
	public List<BookPost>searchByAuthor(@PathVariable String author){
		System.out.println("get books  by author name");
		return service.searchByAuthor(author);
	}
	
	
	  

	@PostMapping("/postBooks")
	public BookPost addBook(@RequestBody BookPost bookPost){
		System.out.println("add books");
		return service.addBook(bookPost);
	}
	
	
	@PostMapping("/postBooks/author/{author}")
	public BookPost addBookByAuthor(@RequestBody BookPost bookPost){
		System.out.println("add books by author ");
		return service.addBookByAuthor(bookPost);
	}
	
	
	@PutMapping("/updateBooksByIsbn/{isbn}")
	public BookPost  updateBookByIsbn(@PathVariable String isbn,  @RequestBody BookPost bookPost) {
		System.out.println("update books");
		return service.updateBookByIsbn(isbn,bookPost);
	}
	
	

	
	@PutMapping("/updateBooksByAuthor/{author}")
	public List<BookPost> updateBookByAuthor(@PathVariable String author,@RequestBody BookPost bookPost) {
		return service.updateBookByAuthor(author, bookPost);
	}
	
	
	
	@DeleteMapping("/deleteBooksByIsbn/{isbn}")
	public String deleteBookByIsbn(@PathVariable String isbn) {
		System.out.println("delete books by id ");
		service.deleteBookByIsbn(isbn);
		return "deleted";
	}
	
	@DeleteMapping("deleteBooksByAuthor/{author}")
	public String deleteBookByAuthor(@PathVariable String author) {
		System.out.println("delete books by author");
		service.deleteBookByAuthor(author);
		return "deleted";
	}
	
	@GetMapping("/load")
	public String loadData() {
		service.load();
		return "success";
	}
}
