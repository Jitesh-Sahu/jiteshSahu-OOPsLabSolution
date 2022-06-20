package com.jitesh.service;

import java.util.Random;

import com.jitesh.model.Employee;

public class CredentialService {
public String generateEmailAddress(String firstName, String lastName, String department)
{
   return firstName + lastName + "@" + department + ".abc.com";

	}
public char[] generatePassword() {
	String capitalLetters="ABCDEFGHIJKLMOPQRSTWXYZ";
	String smallLetters="abcdefghijklmnopqrstuvwxyz";
	String numbers="1234567890";
	String specialCharacters="!@#$%^&*()";
	
	String values=capitalLetters+smallLetters+numbers+specialCharacters;
	
	Random random= new Random();
	
	char[] password= new char[8];
	
	for(int i=0;i<8;i++) {
		password [i]= values.charAt(random.nextInt(values.length()));
	}return password;
}
public void showCredentials(String firstName) {
	System.out.println("Dear"+ firstName +"your generated credentials are as follows");}
	
public void showCredentials(Employee employee, String generatedEmail, char[] generatedPassword) {
	// TODO Auto-generated method stub
	
}
}
