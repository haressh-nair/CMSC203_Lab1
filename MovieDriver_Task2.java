/*
 * Class: CMSC203 
 * Instructor:Professor Monshi
 * Description: Movie Ticket Input collection with loops
 * Due: 02/24/2025
 * Platform/compiler:Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Haressh Nair
*/

import java.util.*;
public class MovieDriver_Task2{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		char again = ' ';
		do {
			Movie object = new Movie();

			System.out.print("Enter movie name: ");
			String movieName = input.nextLine();
			object.setTitle(movieName);

			System.out.print("Enter movie rating: ");
			String movieRating = input.nextLine();
			object.setRating(movieRating);

			System.out.print("Enter tickets sold: ");
			int ticketsSold = input.nextInt();
			object.setSoldTickets(ticketsSold);

			System.out.println(object.toString());
			System.out.print("Do you want to enter another: ");
			again = input.next().toLowerCase().charAt(0);

			input.nextLine();
		}while(again == 'y');
		input.close();
		System.out.print("Goodbye!");
	}

}
