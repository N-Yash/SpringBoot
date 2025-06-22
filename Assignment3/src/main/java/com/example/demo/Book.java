package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@Document
@ToString 
public class Book {
	@Id
	private String bookId;
	private String author;
	private String title;
	private Double price;
	private boolean available;

	public Book() {
	};

	public Book(String bookId, String author, String title, Double price, boolean available) {
		this.bookId = bookId;
		this.author = author;
		this.title = title;
		this.price = price;
		this.available = available;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String id) {
		this.bookId = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String value) {
		this.author = value;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String value) {
		this.title = value;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean value) {
		this.available = value;
	}

	@Override
	public String toString() {
		return "BookModel(" + this.bookId + ", " + this.author + ", " + this.title + ", " + this.price + ", "
				+ this.isAvailable() + ", " + ")";
	}
}