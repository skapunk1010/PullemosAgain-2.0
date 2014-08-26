package com.test;

public class Test{
	public static void main(String[] args){
		//No recuerdo los nombres en inglés jaja
		PowerPuffGirl bombon = new PowerPuffGirl("Bombon");
		PowerPuffGirl burbuja = new PowerPuffGirl("burbuja"); //De ésta sí, peor pos ya!
		PowerPuffGirl bellota = new PowerPuffGirl("Bellota");

		System.out.println(bombon.getNameComplete());
		System.out.println(burbuja.getNameComplete());
		System.out.println(bellota.getNameComplete());
	}
}