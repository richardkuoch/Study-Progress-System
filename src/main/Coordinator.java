package main;

import java.util.Scanner;
public class Coordinator extends Staff
{
	Scanner kb;

		public Coordinator(String id, String password, String first, String last, String dob,String title)
		{
			super(id, password, first, last, dob, title);
		}

		public String ToString()
		{
			return super.ToString() + ",coordinator";
		}

		public void menu(Controller control)
		{
			kb = new Scanner(System.in);
			boolean leave = true;
			do
			{
				System.out.println("Welcome Co-ordinator "+ first +" "+ last +"!");
				System.out.println("---------------------------------------------");
				System.out.println("1. Generate Report");
				System.out.println("2. View student enrolment and course results");
				System.out.println("3. Change a program details");
				System.out.println("4. Create student account(s)");
				System.out.println("5. Enrol student(s) to a program ");
				System.out.println("6. Log out");
				System.out.println("---------------------------------------------");
				System.out.print("Enter in an option >> ");
				String choice = kb.nextLine();


				switch(choice)
				{
					case "1": control.generate_report(); break;
					case "2": control.viewStudentEnrolment(); break;
					case "3": control.changeProgramDetails(); break;
					case "4":
						System.out.print("Enter in the amount of student accounts you want to create >> ");
						int amount = kb.nextInt();
						kb.nextLine();
						control.createStudentAccount(amount); break;
					case "5":
						control.enrol_students();
						break;
					case "6": leave = false; break;
					default: System.out.println("Invalid Input, try again");
				}
			}
			while(leave);

		}
}

