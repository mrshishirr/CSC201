// Student: Mahbub Rahman

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter exception type: ");
		char ex = scanner.nextLine().charAt(0);
		scanner.close();
		try {			
			if ((ex == 'A') | (ex == 'a')) throw new ExceptionA();
			if ((ex == 'B') | (ex == 'b')) throw new ExceptionB();
			if ((ex == 'C') | (ex == 'c')) throw new ExceptionC();
		} 
		catch (ExceptionA e) {			
			e.printStackTrace();
		}
	}

}
