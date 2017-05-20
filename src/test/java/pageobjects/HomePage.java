package pageobjects;

import generic.SeleniumBase;

public class HomePage  extends SeleniumBase{

	String name;
	int age;
	
	public HomePage(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}//constructor

	public HomePage(){
		System.out.println("Constructor of home page");
	}//constructor
	
	public HomePage(String namePerson) {
		super();
		this.name = namePerson;
	}//constructor
	
	public void displayName() {
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);

	}//methodOne
	
}//class

