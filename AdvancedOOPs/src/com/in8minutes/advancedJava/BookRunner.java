package com.in8minutes.advancedJava;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(13, "Object Oriented Programming with Java", "Sarita");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));

		System.out.println(book);
	}

}
