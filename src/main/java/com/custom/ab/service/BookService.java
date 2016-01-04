package com.custom.ab.service;

import com.custom.ab.model.Book;

public interface BookService {
	public int addBook(Book book);
	
	public void deleteBook(Book book);
}
