package Dojo;

import java.util.Scanner;

public class GCDojo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String option;
		System.out.println("Welcome to Grant Chirpus's Code Dojo! We offer a variety of classes that pave the way for an exciting career in technology. Enter 'enroll' at any time to join a class." + "\n");
		
		System.out.println("Our classes include: " + "\n");
		System.out.println("Hard Skills: ");
		System.out.print("Java" + "\n" + "JavaScript" + "\n" + "Web Development" + "\n" + "Software Testing");
		System.out.println("\n");
		System.out.println("Soft Skills: ");
		System.out.print("Interviewing" + "\n" + "Networking" + "\n");
		
		System.out.print("Enter a class name of you would like to know more about that class. " + "\n" + "Enter 'faculty' a list of teachers and what they teach");
		option = input.nextLine();
		System.out.println();

		
		
		if (option.equalsIgnoreCase("faculty")) {
			Teachers.faculty();
		}
	}

}
