// Student: Mahbub Rahman

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(6.8459f, 3.9876f);
		Complex c2 = new Complex(2.8964f, 5.2297f);

		System.out.printf("%n%-15s", "Left operand: ");
		c1.printComplex();
		System.out.printf("%n%-15s", "Right operand: ");
		c2.printComplex();

		System.out.printf("%n%n%-25s", "+ Addition result: ");
		c1.add(c2).printComplex();
		System.out.printf("%n%n%-25s", "- Substraction result: ");
		c1.sub(c2).printComplex();
	}

}
