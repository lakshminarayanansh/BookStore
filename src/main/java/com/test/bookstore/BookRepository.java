package com.test.bookstore;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{

	Book findByISBN(String ISBN);
	List<Book> findByNameContaining(String name);
	
	
}
