// Student: Mahbub Rahman

// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2Tick objects.

public class Time2TickTest {
	public static void main(String[] args) {
		Time2Tick t1 = new Time2Tick(); // 00:00:00
		Time2Tick t2 = new Time2Tick(2); // 02:00:00
		Time2Tick t3 = new Time2Tick(21, 34); // 21:34:00
		Time2Tick t4 = new Time2Tick(12, 25, 42); // 12:25:42
		Time2Tick t5 = new Time2Tick(t4); // 12:25:42

		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified; default minute and second", t2);
		displayTime("t3: hour and minute specified; default second", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2Tick object t4 specified", t5);

		// attempt to initialize t6 with invalid values
		try {
			Time2Tick t6 = new Time2Tick(27, 74, 99); // invalid values
		} catch (IllegalArgumentException e) {
			System.out.printf("%nException while initializing t6: %s%n%n", e.getMessage());
		}

		finally {
			t5 = new Time2Tick(23, 59, 59);
			displayTime("t5: previous object replaced by new Time2Tick object", t5);
			System.out.printf("%n%nNow testing increment:%n");			
			t1.incrementHour();
			displayTime("t1: increment one hour", t1);
			t2.tick();
			displayTime("t2: increment one second", t2);
			t3.incrementMinute();
			displayTime("t3: increment one minute", t3);
			t5.tick();
			displayTime("t5: going into next day by incrementing one second", t5);
		}
	}

	// displays a Time2Tick object in 24-hour and 12-hour formats
	private static void displayTime(String header, Time2Tick t) {
		System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
	}
} // end class Time2Test

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/
