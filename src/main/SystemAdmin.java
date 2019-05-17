package main;

import java.util.Scanner;
public class SystemAdmin extends Staff
{
	Scanner kb;
	Controller controller;
  public SystemAdmin(String id, String password, String first, String last, String dob, String type, Controller controller)
  {
    super(id, password, first, last, dob, type);
  }
  public SystemAdmin(String id, String password, String first, String last, String dob,String title)
 	{
 		super(id, password, first, last, dob, title);
 	}
  public void menu(Controller control)
	{

		kb = new Scanner(System.in);
		boolean leave = true;
		int amount2 = 0;
		do
		{
			System.out.println("Welcome " + title +" "+ first +" "+ last +"!");
			System.out.println("---------------------------------------------");
			System.out.println("1. Create a program");
			System.out.println("2. Change a program details");
			System.out.println("3. Create student account(s)");
			System.out.println("4. Enrol student(s) to a program ");
			System.out.println("5. Create a new Staff Member");
			System.out.println("6. Log out");
			System.out.println("---------------------------------------------");
			System.out.print("Enter in an option >> ");
			String choice = kb.nextLine();
			//kb.nextLine();
			switch(choice)
			{
				case "1":
					int counter2 = 0;
					System.out.println("Enter Number of programs to create: ");
					String counter = kb.nextLine();
					try{counter2 = Integer.parseInt(counter);}
					catch(Exception e){System.out.println("Error: Non-numeric data entered, try again.");}
					control.createProgram(counter2);
					break;
				case "2": control.changeProgramDetails(); break;
				case "3": System.out.print("Enter in the amount of student accounts you want to create >> ");
					String amount = kb.nextLine();
					try{amount2 = Integer.parseInt(amount);}
					catch(Exception e){System.out.println("Error: Non-numeric data entered, try again.");}
					control.createStudentAccount(amount2); break;
				case "4":
					control.enrol_students();
					break;
				case "5": System.out.print("Enter in the role of staff you want to create >> ");
				String role = kb.nextLine();
				control.createRole(role); break;
				case "6": leave = false; break;
				default: System.out.println("Invalid Input, try again");
			}
		}
		while(leave);

	}

		public String ToString()
	{
		return super.ToString() + ",sysadmin";
	}
}
