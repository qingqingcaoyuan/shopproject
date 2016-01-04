package com.custom.ab.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.custom.ab.model.Book;
import com.custom.ab.service.BookService;
@RequestMapping("book")
@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("addBook")
	public String addBook(Book book){
		book.setCategory("Chinese");
		book.setName("汉语初级");
		book.setPrice(new BigDecimal(45.00));
		bookService.addBook(book);
		return "ab/addBook";
	}
}
