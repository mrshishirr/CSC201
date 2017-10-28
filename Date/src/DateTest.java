// Student: Mahbub Rahman

public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date(2, 12, 2016);
		Date d2 = new Date(2, 29, 2016);
		Date d3 = new Date(9, 30, 2099);

		try {
			Date d4 = new Date(13, 32, 2016);
		} catch (IllegalArgumentException e) {
			System.out.printf("%nException while initializing d4: %s%n", e.getMessage());
		} finally {
		}

	}

}
