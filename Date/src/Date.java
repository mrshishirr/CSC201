// Student: Mahbub Rahman

public class Date {
	private int month, date, year;

	private static final int[] daysPerMonth = 
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	private static final String[] monthList = 
		{"", "January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"};

	public Date(int month, int date, int year) throws IllegalArgumentException
	{
		// check if month in range
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException(
					"month (" + month + ") must be 1-12");

		// check if day in range for month
		if (date <= 0 || 
				(date > daysPerMonth[month] && !(month == 2 && date == 29)))
			throw new IllegalArgumentException("day (" + date + 
					") out-of-range for the specified month and year");

		// check for leap year if month is 2 and day is 29
		if (month == 2 && date == 29 && !(year % 400 == 0 || 
				(year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + date +
					") out-of-range for the specified month and year");

		this.month = month;
		this.date = date;
		this.year = year;

		System.out.printf(
				"Date object constructor for date %s%n", this);
	} 

	public Date(String month, int date, int year) throws IllegalArgumentException {			

		for (int i=0; i<monthList.length; i++) {
			if (monthList[i].equals(month))
				this.month = i;
		}
		
		/*if (month.equals("January")) this.month = 1;
		else if (month.equals("February")) this.month = 2;
		else if (month.equals("March")) this.month = 3;
		else if (month.equals("April")) this.month = 4;
		else if (month.equals("May")) this.month = 5;
		else if (month.equals("June")) this.month = 6;
		else if (month.equals("July")) this.month = 7;
		else if (month.equals("August")) this.month = 8;
		else if (month.equals("September")) this.month = 9;
		else if (month.equals("October")) this.month = 10;
		else if (month.equals("November")) this.month = 11;
		else if (month.equals("December")) this.month = 12;
		else throw new IllegalArgumentException("Invalid Month Name!");*/
		// check if day in range for month
		if (date <= 0 || 
				(date > daysPerMonth[this.month] && !(this.month == 2 && date == 29)))
			throw new IllegalArgumentException("day (" + date + 
					") out-of-range for the specified month and year");

		// check for leap year if month is 2 and day is 29
		if (this.month == 2 && date == 29 && !(year % 400 == 0 || 
				(year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + date +
					") out-of-range for the specified month and year");
		this.date = date;
		this.year = year;
		
		System.out.printf(
		         "Date object constructor for date %s%n", this);
	}

	public Date(int day, int year) {
		this.year = year;
		int j = 0;
		for (int i : daysPerMonth)
		{
			j = j + daysPerMonth[i];
			if (i == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
				j++;
			if (day <= j) {
				this.month = i;
				this.date = day - (j - daysPerMonth[i-1]);
				break;
			}
			
		}
		System.out.printf(
		         "Date object constructor for date %s%n", this);	

	}
	
	public String toString()
	   { 
	      String s = String.format("%2d/%2d/%4d", month, date, year);	      
	      s = s + String.format("%n%s %2d, %4d", monthList[month], date, year);
	      int day=0;
	      for (int i=0; i<month; i++) {
	    	  if (i == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
	    		  day++;
	    	  day = day + daysPerMonth[i];
	      }
	      day = day + date;
	      s = s + String.format("%n%3d %4d", day, year);
	      return s;
	   } 
}
