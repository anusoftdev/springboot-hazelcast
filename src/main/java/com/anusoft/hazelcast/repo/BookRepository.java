package com.anusoft.hazelcast.repo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.anusoft.hazelcast.model.Book;

@Component
public class BookRepository {
	
	private static Map<String, Book> books = new HashMap<String, Book>();

	@PostConstruct
	private void init() {
		books.put("B101", new Book("B101", "Wings of Fire", "APJ Abdul Kalam", 249.00, "Diamond Publication"));
		books.put("B102", new Book("B102", "Bhagwat Geeta", "Ved Vyas", 449.00, "Diamond Publication"));
		books.put("B103", new Book("B103", "Ramayan", "Valmiki", 349.00, "Diamond Publication"));
	}

	public Optional<Book> findBookById(String id) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Optional.of(books.get(id));
	}

	public Book updateBook(String id, Book book) throws Exception {
		if(Optional.of(books.get(id)).isPresent()) {
			book.setId(id);
			books.put(id, book);
			return books.get(id);
		} else {
			throw new Exception("Book not found!");
		}
	}
}
