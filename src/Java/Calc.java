package Java;

import java.util.ArrayList;
import java.util.Date;

public class Calc {
	private int oap, child, adult, student;
	
	public Calc() {
		super();
		oap = 6;
		child = 4;
		adult = 8;
		student = 6;
	}
	
	
	public int getOap() {
		return oap;
	}

	public int getChild() {
		return child;
	}


	public int getAdult() {
		return adult;
	}


	public int getStudent() {
		return student;
	}
	public void checkDay() {
		Date today = new Date();
		int day = today.getDay();
		switch(day) {
		case 3:
			oap-=2;
			child-=2;
			adult-=2;
			student-=2;
		}
	}

	
	public int tPrice(ArrayList<String> tickets) {
		int tPrice = 0;

		for(int i = 0; i<tickets.size();i++) {
			if(tickets.get(i).equalsIgnoreCase("standard")) {
				tPrice+=this.adult;
			}else if(tickets.get(i).equalsIgnoreCase("oap")) {
				tPrice+=this.oap;
			}else if(tickets.get(i).equalsIgnoreCase("student")) {
				tPrice+=this.student;
			}else if(tickets.get(i).equalsIgnoreCase("child")) {
				tPrice+=this.child;
			}
		}
		return tPrice;
	}
	public boolean allowedToBuy(String tickType, Movie m) {
		if(tickType.equalsIgnoreCase("child") && m.getAgeRating()>=16) {
			return false;
		}
		
		return true;
	}
}
