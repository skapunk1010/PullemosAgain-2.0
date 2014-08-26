package com.test;

//Las chicas superpoderosas son???
//R: INSERTE RESPUESTA ACÁ.

public class Person{
	private int age;
	private String name;
	private String lastName;
	private String firstName;

	public Person(String n,String f, String l,int a){
		this.age = a;
		this.name = n;
		this.firstName = f;
		this.lastName = l;
	}

	public int getAge(){
		return age;
	}

	public String getName(){
		return name;
	}

	public String getLastName(){
		return lastName;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getNameComplete(){
		return name + " "+firstName + " "+ lastName;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
}
