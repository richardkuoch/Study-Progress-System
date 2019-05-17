package main;

import java.util.Scanner;

public class FacultyAdmin extends Staff
{Scanner kb;
	Controller controller;
	public FacultyAdmin(String id, String password, String first, String last, String dob, String title, Controller controller)
	{
		super(id, password, first, last, dob, title);
	}

	public FacultyAdmin(String id, String password, String first, String last, String dob,String title)
	{
		super(id, password, first, last, dob, title);
	}

	public void menu(Controller control)
	{
		kb = new Scanner(System.in);
		boolean leave = true;
		do
		{
			System.out.println("Welcome Faculty Admin "+ first + " " + last +"!");
			System.out.println("---------------------------------------------");
			System.out.println("1. Generate Report");
			System.out.println("2. View student enrolment and course results");
			System.out.println("3. Log out");
			System.out.println("---------------------------------------------");
			System.out.print("Enter in an option >> ");
			String choice = kb.nextLine();
			//kb.nextLine();
			switch(choice)
			{
				case "1": controller.generate_report(); break;
				case "2": controller.viewStudentEnrolment(); break;
				case "3": leave = false; break;
				default: System.out.println("Invalid Input, try again.");
			}
		}
		while(leave);

	}

	public String ToString()
	{
		return super.ToString()+ ",facadmin";
	}
}
