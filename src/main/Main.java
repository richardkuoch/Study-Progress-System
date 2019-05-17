package main;
/* Richard s3563242 - Assignment Contribution  */
import java.util.Scanner;

//main menu
public class Main
{
    static Controller control = new Controller();


    public static void main(String[] args){
        
    //scanner for user input    
   	Scanner sc = new Scanner(System.in);


         // variables required to process user's menu selection
         String userInput;
         int count = 0;

         String selection = "0";

         // keep repeating the menu until the user chooses to exit
         do
         {
        	// display menu options
        	 if(count >= 10)
        	 {
        		 System.out.println("DDoS Attack! Quitting Program.");
        		 return; 
        	 }
            System.out.println("Study Progess System Menu");
            System.out.println("-------------------------");
            System.out.println("1. Student Login");
            System.out.println("2. Staff Login");
            System.out.println("3. Exit Program");

            // prompt the user for input
            System.out.print("Enter your selection: ");
           
            userInput = sc.nextLine();
            selection = userInput;
          
            System.out.println();
       
            // validate user has entered correct input

               // convert to case-insensitive input
            
               // process the user's selection
               switch (selection)
               {
                  case "1":
                     if (control.studentLogin() == false)
                     {
                    	 count++;
                    	 break;
                     }
                    	 control.studentMenu();
 
                     break;


                  case "2":

                     // call progCordLogin()
                     if (control.staffLogin() == false){
                    	 count++;
                    	 break;
                     }
                    	 control.staffMenu();
                     //System.out.println("-");
                     break;

                  case "3":
                     System.out.println("Program Terminated!");
                     return;

                  default:

                     System.out.println("Error - invalid selection!");
                     break;
               }
               System.out.println();
         }while (!selection.equals(0));
        
   }
}
