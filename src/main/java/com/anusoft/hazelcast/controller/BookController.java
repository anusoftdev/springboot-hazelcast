package com.anusoft.hazelcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anusoft.hazelcast.model.Book;
import com.anusoft.hazelcast.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/status")
	public String isAlive() {
		return "Hi! I am online!";
	}
	
	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable String id) {
		return bookService.getBookById(id);
	}
	
	@PostMapping("/book/{id}")
	public Book modifyBook(@PathVariable String id, @RequestBody Book book) {
		return bookService.updateBook(id, book);
	}

}
