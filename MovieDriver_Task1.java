/*
 * Class: CMSC203 
 * Instructor:Professor Monshi
 * Description: Movie Ticket Input collection 
 * Due: 02/24/2025
 * Platform/compiler:Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Haressh Nair
*/



import java.util.*;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Movie movie = new Movie();

        System.out.println("Enter the name of a movie:");
        String title = input.nextLine();
        movie.setTitle(title);

        System.out.println("Enter the rating of the movie:");
        String rating = input.nextLine();
        movie.setRating(rating);

        System.out.println("Enter the number of tickets sold for this movie:");
        int ticketsSold = input.nextInt();
        movie.setSoldTickets(ticketsSold);
        System.out.println(movie.toString());

        System.out.println("Goodbye!");
        input.close();
    }
}
