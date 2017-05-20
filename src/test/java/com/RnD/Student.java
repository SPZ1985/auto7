package com.RnD;

public class Student {

	int rollNo;
	String firstName;
	String course;	
	

	public Student(int rollNo, String firstName, String course) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.course = course;
	}


	public void displayStudent() {
			System.out.println("Student name : " + this.firstName + "\n " + 
					"course name : " + this.course + "\n " +
							"rollNo : " + this.rollNo + "\n " );
	}//displayStudent

}//class
