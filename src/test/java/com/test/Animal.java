package com.test;



public class Animal {
	
	void login() {
		
		System.out.println("FB login code");

	}
	
	static void registration() {
		
		System.out.println("Registration code");
		
	}
	
	static void logout() {
		
		System.out.println("FB logout code");
	}
	
	public static void main(String[] args) {
		
		Animal.registration();
		Animal.logout();
		
		Animal obj = new Animal();
		obj.login();
	}
	

}