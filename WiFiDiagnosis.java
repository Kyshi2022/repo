/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: A program that will step through some possible problems to help the user restore their Internet connectivity.
 * Due: 9/13/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Kyle Duong
*/

import java.util.Scanner; //import scanner so that the user can type in their responses

public class WiFiDiagnosis { //main class
	
	public static void main (String[] args) { //main method
		
		String input; //string variable to get the user's inputs
		String output = "appears to reconnect you to the Internet again."; //initialize this string to concatenate with the responses answered in "yes"
		int step = 1; //initialize this variable to 1 to that this will be the first of 5 potential responses the program will give out
		Scanner keyboard = new Scanner (System.in); //create a scanner object for the user to type in responses
		
		System.out.println("If you have any problems with your Internet, this Wifi Diagnosis might help you out.");
		System.out.println("Step #1: Reboot your computer and try to reconnect again.");
		System.out.println("Are you able to reconnect to the Internet again? (yes or no)");
		
		input = keyboard.nextLine(); //this is where the user gets to type in their own responses in either "yes" or "no"
		
		if (input.equals("no")) { //nested if statements that continues on if the user responds "no"
			
			step++; //step variable increments every time a "no" has been given which will determine the case # for the switch statement at the end of the program
			
			System.out.println("Step #2: Reboot your router and try to reconnect again.");
			System.out.println("Are you able to reconnect to the Internet again? (yes or no)");
			
			input = keyboard.nextLine();
			
			if (input.equals("no")) {
				
				step++;
				
				System.out.println("Step #3: Make sure the cables connecting the router are firmly plugged in and power is getting to your router.");
				System.out.println("Are you able to reconnect to the Internet again? (yes or no)");
				
				input = keyboard.nextLine();
				
				if (input.equals("no")) {
					
					step++;
					
					System.out.println("Step #4: Move the computer closer to your router and try to reconnect again.");
					System.out.println("Are you able to reconnect to the Internet again? (yes or no)");
					
					input = keyboard.nextLine();
					
					if (input.equals("no")) {
						
						step++;
						
						System.out.println("Step #5: Contact your ISP.");
						
					}
				}
			}
		}
		
		switch (step) //switch statement that will give a final response to the user depending on which step they ended on, the case # is determined by the step variable
		{
		
			case 1: {
				System.out.println("Rebooting your computer " + output);
				break;
			}
			
			case 2: {
				System.out.println("Rebooting your router " + output);
				break;
			}
			
			case 3: {
				System.out.println("Checking your router cables " + output);
				break;
			}
			
			case 4: {
				System.out.println("Moving your computer closer to the router " + output);
				break;
			}
			
			default: {
				System.out.println("Make sure your ISP is hooked to your router.");
			}
		} //end switch statement
	} //end main method
} //end main class
