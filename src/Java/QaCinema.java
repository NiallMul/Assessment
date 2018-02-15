package Java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
//import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QaCinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initial work
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
		
		//Scanner input = new Scanner(System.in);
		//int choice = 0;

		String stdTicket = "Standard";
		String oapTicket = "OAP";
		String stuTicket = "Student";
		String chldTicket = "Child";
		
		//Expanded work
		JFrame mainFrame = new JFrame("QA Cinemas");
		JPanel filmPanel = new JPanel();
		JButton braveheartBtn = new JButton(braveheart.getName());
		braveheartBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String> ticketList = new ArrayList<>();
				JFrame braveFrame = new JFrame("BraveHeart");
				JPanel ticketOptions = new JPanel();
				
				JButton adltBtn = new JButton(stdTicket);
				JTextField adltTickets = new JTextField();
				adltTickets.setEditable(false);
				adltBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(stdTicket);
						int ticketNum;
						if(adltTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(adltTickets.getText());
						}
						String newNum = ticketNum+1+"";
						adltTickets.setText(newNum);
					}
					
				});
				
				JButton oapBtn = new JButton(oapTicket);
				JTextField oapTickets = new JTextField();
				oapTickets.setEditable(false);
				oapBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(oapTicket);
						int ticketNum;
						if(oapTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(oapTickets.getText());
						}
						String newNum = ticketNum+1+"";
						oapTickets.setText(newNum);
					}
					
				});
				
				JButton stuBtn = new JButton(stuTicket);
				JTextField stuTickets = new JTextField();
				stuTickets.setEditable(false);
				stuBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(stuTicket);
						int ticketNum;
						if(stuTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(stuTickets.getText());
						}
						String newNum = ticketNum+1+"";
						stuTickets.setText(newNum);
					}
					
				});
				
				JButton chldBtn = new JButton(chldTicket);
				JTextField chldTickets = new JTextField();
				chldTickets.setEditable(false);
				chldBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(ticketOptions, "This movie is unsuitable for children");
					}
					
				});
				
				JPanel finishedBuying = new JPanel();
				JButton calcPrice = new JButton("Calculate total");
				calcPrice.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						int tPrice = ticketCalc.tPrice(ticketList);
						JOptionPane.showMessageDialog(ticketOptions, "Your total is: £"+tPrice);
					}
					
				});
				finishedBuying.add(calcPrice);
				
				
				ticketOptions.setLayout(new GridLayout(4,2));
				ticketOptions.add(adltBtn);
				ticketOptions.add(adltTickets);
				ticketOptions.add(oapBtn);
				ticketOptions.add(oapTickets);
				ticketOptions.add(stuBtn);
				ticketOptions.add(stuTickets);
				ticketOptions.add(chldBtn);
				ticketOptions.add(chldTickets);
				
				braveFrame.add(ticketOptions, BorderLayout.CENTER);
				braveFrame.add(finishedBuying, BorderLayout.SOUTH);
				braveFrame.setSize(300,500);
				braveFrame.setLocationRelativeTo(mainFrame);
				braveFrame.setVisible(true);
				
			}
			
		});
		JButton monstersIncBtn = new JButton(monstersInc.getName());
		monstersIncBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String> ticketList = new ArrayList<>();
				JFrame monstersFrame = new JFrame("Monsters inc");
				JPanel ticketOptions = new JPanel();
				
				JButton adltBtn = new JButton(stdTicket);
				JTextField adltTickets = new JTextField();
				adltTickets.setEditable(false);
				adltBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(stdTicket);
						int ticketNum;
						if(adltTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(adltTickets.getText());
						}
						String newNum = ticketNum+1+"";
						adltTickets.setText(newNum);
					}
					
				});
				
				JButton oapBtn = new JButton(oapTicket);
				JTextField oapTickets = new JTextField();
				oapTickets.setEditable(false);
				oapBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(oapTicket);
						int ticketNum;
						if(oapTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(oapTickets.getText());
						}
						String newNum = ticketNum+1+"";
						oapTickets.setText(newNum);
					}
					
				});
				
				JButton stuBtn = new JButton(stuTicket);
				JTextField stuTickets = new JTextField();
				stuTickets.setEditable(false);
				stuBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(stuTicket);
						int ticketNum;
						if(stuTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(stuTickets.getText());
						}
						String newNum = ticketNum+1+"";
						stuTickets.setText(newNum);
					}
					
				});
				
				JButton chldBtn = new JButton(chldTicket);
				JTextField chldTickets = new JTextField();
				chldTickets.setEditable(false);
				chldBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(chldTicket);
						int ticketNum;
						if(chldTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(chldTickets.getText());
						}
						String newNum = ticketNum+1+"";
						chldTickets.setText(newNum);
						}
				});
				
				JPanel finishedBuying = new JPanel();
				JButton calcPrice = new JButton("Calculate total");
				calcPrice.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						int tPrice = ticketCalc.tPrice(ticketList);
						JOptionPane.showMessageDialog(ticketOptions, "Your total is: £"+tPrice);
					}
					
				});
				finishedBuying.add(calcPrice);
				
				
				ticketOptions.setLayout(new GridLayout(4,2));
				ticketOptions.add(adltBtn);
				ticketOptions.add(adltTickets);
				ticketOptions.add(oapBtn);
				ticketOptions.add(oapTickets);
				ticketOptions.add(stuBtn);
				ticketOptions.add(stuTickets);
				ticketOptions.add(chldBtn);
				ticketOptions.add(chldTickets);
				
				monstersFrame.add(ticketOptions, BorderLayout.CENTER);
				monstersFrame.add(finishedBuying, BorderLayout.SOUTH);
				monstersFrame.setSize(300,500);
				monstersFrame.setLocationRelativeTo(mainFrame);
				monstersFrame.setVisible(true);
				
			}
			
		});
		JButton screamBtn = new JButton(scream.getName());		
		screamBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String> ticketList = new ArrayList<>();
				JFrame screamFrame = new JFrame("Scream");
				JPanel ticketOptions = new JPanel();
				
				JButton adltBtn = new JButton(stdTicket);
				JTextField adltTickets = new JTextField();
				adltTickets.setEditable(false);
				adltBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(stdTicket);
						int ticketNum;
						if(adltTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(adltTickets.getText());
						}
						String newNum = ticketNum+1+"";
						adltTickets.setText(newNum);
					}
					
				});
				
				JButton oapBtn = new JButton(oapTicket);
				JTextField oapTickets = new JTextField();
				oapTickets.setEditable(false);
				oapBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(oapTicket);
						int ticketNum;
						if(oapTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(oapTickets.getText());
						}
						String newNum = ticketNum+1+"";
						oapTickets.setText(newNum);
					}
					
				});
				
				JButton stuBtn = new JButton(stuTicket);
				JTextField stuTickets = new JTextField();
				stuTickets.setEditable(false);
				stuBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ticketList.add(stuTicket);
						int ticketNum;
						if(stuTickets.getText().equals("")) {
							ticketNum = 0;
						}else {
							ticketNum = Integer.parseInt(stuTickets.getText());
						}
						String newNum = ticketNum+1+"";
						stuTickets.setText(newNum);
					}
					
				});
				
				JButton chldBtn = new JButton(chldTicket);
				JTextField chldTickets = new JTextField();
				chldTickets.setEditable(false);
				chldBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(ticketOptions, "This movie is unsuitable for children");
						}
				});
				
				JPanel finishedBuying = new JPanel();
				JButton calcPrice = new JButton("Calculate total");
				calcPrice.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						int tPrice = ticketCalc.tPrice(ticketList);
						JOptionPane.showMessageDialog(ticketOptions, "Your total is: £"+tPrice);
					}
					
				});
				finishedBuying.add(calcPrice);
				
				
				ticketOptions.setLayout(new GridLayout(4,2));
				ticketOptions.add(adltBtn);
				ticketOptions.add(adltTickets);
				ticketOptions.add(oapBtn);
				ticketOptions.add(oapTickets);
				ticketOptions.add(stuBtn);
				ticketOptions.add(stuTickets);
				ticketOptions.add(chldBtn);
				ticketOptions.add(chldTickets);
				
				screamFrame.add(ticketOptions, BorderLayout.CENTER);
				screamFrame.add(finishedBuying, BorderLayout.SOUTH);
				screamFrame.setSize(300,500);
				screamFrame.setLocationRelativeTo(mainFrame);
				screamFrame.setVisible(true);
			}
			
		});
		JLabel welcomeMessage = new JLabel("Welcome "+ user.getName()+" please select a movie");
		
		filmPanel.setLayout(new FlowLayout());
		filmPanel.add(braveheartBtn);
		filmPanel.add(monstersIncBtn);
		filmPanel.add(screamBtn);
		
		mainFrame.add(welcomeMessage, BorderLayout.NORTH);
		mainFrame.add(filmPanel, BorderLayout.CENTER);
		mainFrame.setSize(450,200);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		mainFrame.setVisible(true);
		
		/*initial work to ensure basic functionality
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
		}*/
	}
}
