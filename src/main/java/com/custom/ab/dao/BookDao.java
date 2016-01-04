package com.custom.ab.dao;

import com.custom.ab.model.Book;

public interface BookDao {
	
	public int addBook(Book book);
	
	public void deleteBook(Book book);
}
