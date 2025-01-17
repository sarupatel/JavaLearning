package com.in28minutes.learnspringboot.courses.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "course1") // This allows to create table in H2 DB with specified name rather than class
							// name
public class Course {

	@Id
	@GeneratedValue
	private long id;

	// @Column(name = "Course_name") // This allows to change the name of the table
	// field
	private String name;
	private String author;

	public Course() {
	}

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
