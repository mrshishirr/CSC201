// Student: Mahbub Rahman

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.setLength(5);
		r.setWidth(4);
		
		System.out.printf("Length is: %.2f%n", r.getLength());
		System.out.printf("Width is: %.2f", r.getWidth());
		System.out.printf("%n%n");
		
		System.out.printf("Calculated perimeter: %.2f%n", r.showPerimeter());
		System.out.printf("Calculated area: %.2f", r.showArea());
		System.out.printf("%n%n");
		
		r.setLength(-1);
		r.setWidth(20);
		
		System.out.printf("Length is: %.2f%n", r.getLength());
		System.out.printf("Width is: %.2f", r.getWidth());
		System.out.printf("%n%n");
		
		System.out.printf("Calculated perimeter: %.2f%n", r.showPerimeter());
		System.out.printf("Calculated area: %.2f", r.showArea());
		System.out.printf("%n%n");	
		

	}

}
