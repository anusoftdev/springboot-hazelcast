package com.anusoft.hazelcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anusoft.hazelcast.model.Book;
import com.anusoft.hazelcast.repo.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book getBookById(String id) {
		return bookRepository.findBookById(id).isPresent() ? bookRepository.findBookById(id).get() : null;
	}
	
	public Book updateBook(String id, Book book) {
		try {
			return bookRepository.updateBook(id, book);
		} catch (	Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
