package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class QaCinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring variables
		ArrayList<Movie> movieList = new ArrayList<>();
		
		Movie braveheart = new Movie("Braveheart", "Historical/Fantasy", 138, 16);
		Movie monstersInc = new Movie("Monsters inc.", "child/Fantasy", 116, 0);
		Movie scream = new Movie("Scream", "Horror", 106, 18);
		
		movieList.add(braveheart);
		movieList.add(monstersInc);
		movieList.add(scream);

		User user = new User("Niall", "niallmulready@gmail.com");
		Calc ticketCalc = new Calc();

		Scanner input = new Scanner(System.in);
		int choice = 0;

		ArrayList<String> ticketList = new ArrayList<>();
		String stdTicket = "Standard";
		String oapTicket = "OAP";
		String stuTicket = "Student";
		String chldTicket = "Child";

		System.out.println("Welcome to QA Cinemas");
		System.out.println("How are you: " + user.getName());
		System.out.println("Please select the film you wish to watch by entering the number shown next to it: ");
		//for loop to print arraylist of movies
		for (int i = 0; i < movieList.size(); i++) {
			System.out.println(i + ": " + movieList.get(i).getName());
		}
		System.out.println("4: to quit");
		choice = input.nextInt();
		
		if (choice < 3 && choice >= 0) {
			ticketCalc.checkDay();
			System.out.println("Please select the tickets you wish to purchase");
			System.out.println("1: " + stdTicket);
			System.out.println("2: " + oapTicket);
			System.out.println("3: " + stuTicket);
			boolean ageAppropriate = ticketCalc.allowedToBuy(chldTicket, movieList.get(choice));
			if (ageAppropriate) {
				System.out.println("4: " + chldTicket);
			}
			System.out.println("5: to quit");
			do {
				choice = input.nextInt();
				switch (choice) {
				case 1:
					ticketList.add(stdTicket);
					break;
				case 2:
					ticketList.add(oapTicket);
					break;
				case 3:
					ticketList.add(stuTicket);
					break;
				case 4:
					ticketList.add(chldTicket);
					break;
				}
			} while (choice != 5);

			int tPrice = ticketCalc.tPrice(ticketList);
			System.out.print("The total price is: £" + tPrice);
		}else if(choice == 4) {
			System.out.print("Goodbye");
		}
	}
}
