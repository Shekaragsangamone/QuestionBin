package com.journaldev.spring.controller;

import java.util.Random;

public class UserCredentials {

	public static void main (String args[]) {
		UserCredentials user = new UserCredentials();

		user.getUserName();
		user.getUserPassword();
	}


	public void getUserName() {
		int len=8;
		String upperCaseLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetter="abcdefghijklmnopqrstuvwxyz";
		String numbers="123456789";

		String namevalues=upperCaseLetter+lowerCaseLetter+numbers;

		Random random = new Random();

		char[] userName=new char[len];
		for(int i=0;i<len;i++) {
			userName[i]=namevalues.charAt(random.nextInt(namevalues.length()));

		}
		System.out.println(userName);

	}


	public void getUserPassword() { int len=8; String
	upperCaseLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; String
	lowerCaseLetter="abcdefghijklmnopqrstuvwxyz"; String
	specialCharacters="@!$#%^&*_<>?"; 
	String numbers="123456789";

	String passwordValues=upperCaseLetter+lowerCaseLetter+specialCharacters+numbers;

	Random random = new Random();

	char[] password=new char[len];
	for(int i=0;i<len;i++) {
		password[i]=passwordValues.charAt(random.nextInt(passwordValues.length()));

	} 
	System.out.println(password);

	}

}
