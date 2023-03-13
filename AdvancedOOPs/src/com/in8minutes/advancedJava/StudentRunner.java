package com.in8minutes.advancedJava;

public class StudentRunner {

	public static void main(String[] args) {

		Employee employee = new Employee("Hiren", "Vice President");

		// private String college;
		// private String studentID;

		// employee.setName("Sarita");
		employee.setEmail("abc@gmail.com");
		employee.setPhone("415-123-9876");
		employee.setEmployeeGrade('A');
		// employee.setTitle("SW Test Manager");

		System.out.println(employee);
	}

}
