package com.custom.ab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custom.ab.dao.BookDao;
import com.custom.ab.model.Book;
import com.custom.ab.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;
	
	public int addBook(Book book){
		bookDao.addBook(book);
		return 1;
	}
	
	public void deleteBook(Book book){
		bookDao.deleteBook(book);
	}
}
