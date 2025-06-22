package com.va.week8;

public class Book {
	
	private long id;
	private String name;
	private String title;
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Book(long id, String name, String title) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
	}
	public Book() {
		super();
	}

}
