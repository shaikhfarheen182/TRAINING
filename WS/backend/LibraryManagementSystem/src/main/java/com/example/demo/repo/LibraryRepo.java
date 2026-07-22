package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.BookPost;

public interface LibraryRepo extends JpaRepository<BookPost,Integer> {

	Optional<BookPost> findByIsbn(String isbn);

    List<BookPost> findByAuthorContainingIgnoreCase(String author);

    void deleteByIsbn(String isbn);

    void deleteByAuthor(String author);
    
    
   


    
}