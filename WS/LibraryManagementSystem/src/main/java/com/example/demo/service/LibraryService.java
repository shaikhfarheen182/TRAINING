package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookPost;
import com.example.demo.repo.LibraryRepo;

import jakarta.transaction.Transactional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepo repo;

    public List<BookPost> getAllBooks() {
        return repo.findAll();
    }

    public BookPost getBookByIsbn(String isbn) {
        return repo.findByIsbn(isbn).orElse(null);
    }

    public List<BookPost> searchByAuthor(String author) {
        return repo.findByAuthorContainingIgnoreCase(author);
    }
    
    
    public BookPost addBookByAuthor(BookPost bookPost) {
		return repo.save(bookPost);
	}

    public BookPost addBook(BookPost bookPost) {
        return repo.save(bookPost);
    }

    public BookPost updateBookByIsbn(String isbn, BookPost bookPost) {
        BookPost existing = repo.findByIsbn(isbn).orElse(null);

        if (existing == null) {
            return null;
        }

        existing.setTitle(bookPost.getTitle());
        existing.setAuthor(bookPost.getAuthor());
        existing.setCategory(bookPost.getCategory());
        existing.setTotalCopies(bookPost.getTotalCopies());
        existing.setAvailableCopies(bookPost.getAvailableCopies());

        return repo.save(existing);
    }
    
    public List<BookPost> updateBookByAuthor(String author, BookPost bookPost) {

        List<BookPost> books = repo.findByAuthorContainingIgnoreCase(author);

        for (BookPost b : books) {
            b.setCategory(bookPost.getCategory());
            b.setTotalCopies(bookPost.getTotalCopies());
            b.setAvailableCopies(bookPost.getAvailableCopies());
        }

        return repo.saveAll(books);
    }
    @Transactional
    public void deleteBookByIsbn(String isbn) {
        repo.deleteByIsbn(isbn);
    }

    @Transactional
    public void deleteBookByAuthor(String author) {
        repo.deleteByAuthor(author);
    }

    public void load() {
        repo.save(new BookPost(null, "Java Basics", "James Gosling", "ISBN101", "Programming", 10, 10));
        repo.save(new BookPost(null, "Spring Boot Guide", "Rod Johnson", "ISBN102", "Backend", 8, 8));
        repo.save(new BookPost(null, "Clean Code", "Robert Martin", "ISBN103", "Software", 5, 5));
    }

	

	
	
}