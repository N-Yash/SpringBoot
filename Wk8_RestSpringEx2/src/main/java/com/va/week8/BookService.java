package com.va.week8;

import java.util.HashSet;

public interface BookService {
	
	/*
	 * create methods for operationss
	 */
	HashSet<Book> finadallBook();
	Book findBookById(long id);
	void addBook(Book b);
	void deleteAllData();
	
	/*
	 * which methods would bind with the business logic you would add to the interface!. 
	 */
	
	/*
	 * dummy methods with no defination
	 */
	

}
