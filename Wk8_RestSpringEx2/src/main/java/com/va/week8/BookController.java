package com.va.week8;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// this is the annotation required for REST based applications. 
@RestController
public class BookController {
	
	@Autowired
	BookServiceImpl bookServiceImp;



// adding a new record or inserting data..	
	@PostMapping("/")
	public void addBook(@RequestBody Book  book) {
		bookServiceImp.addBook(book);
	}
	
	@GetMapping("/findall") 
    public HashSet<Book> getAllBook() { 
        return bookServiceImp.finadallBook(); 
    } 
  
    @GetMapping("/findbyid/{id}") 
    public Book geBookById(@PathVariable long id) { 
        return bookServiceImp.findBookById(id); 
    } 
  
    @DeleteMapping("/delete") 
    public void deleteBook() { 
    	bookServiceImp.deleteAllData(); 
    } 
}
