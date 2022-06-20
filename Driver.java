package com.jitesh.main;

import java.util.Scanner;

import com.jitesh.model.Employee;
import com.jitesh.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		Employee employee= new Employee("Jitesh","Sahu");
		CredentialService cs= new CredentialService();
		String generatedEmail;
		char[]generatedPassword;
		
		System.out.println("Please enter the department from following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1: generatedEmail=cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"techn");
		        generatedPassword=cs.generatePassword();
		        System.out.println(generatedEmail);
		        System.out.println(generatedPassword);
		break;
		case 2: generatedEmail=cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"ad");
		generatedPassword=cs.generatePassword();
		System.out.println(generatedEmail);
        System.out.println(generatedPassword);
		break;
		case 3: generatedEmail=cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"hr");
		generatedPassword=cs.generatePassword();
		System.out.println(generatedEmail);
        System.out.println(generatedPassword);
		break;
		case 4: generatedEmail=cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"legal");
		generatedPassword=cs.generatePassword();
		System.out.println(generatedEmail);
        System.out.println(generatedPassword);
		break;
		default: 
			System.out.println("enter valid input");
		}
	}
}

