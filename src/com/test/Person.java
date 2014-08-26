package com.test;

//Las chicas superpoderosas son???
//R: Pos' una combinación de azucar, flores y muchos colores :v

//¿A quién se le perdió la cadenita?
<<<<<<< HEAD
//R: Pues a Carrrrmen.
=======
//R: A caaaaaaarmeen!(8)
>>>>>>> 5486c5933f89bd4555699166243e296bab2f3c10


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
