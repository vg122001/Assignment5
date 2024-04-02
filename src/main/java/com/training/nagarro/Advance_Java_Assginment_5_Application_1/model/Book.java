package com.training.nagarro.Advance_Java_Assginment_5_Application_1.model;


public class Book {
	

	private String id;
	private String bookName;

	private Author authorName;
	private String date;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getAuthorName() {
		return authorName;
	}
	public void setAuthorName(Author authorName) {
		this.authorName = authorName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
