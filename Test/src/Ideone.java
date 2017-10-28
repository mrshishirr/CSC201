import java.util.Scanner;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x = 0;
		int y = 3;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		if (x >= y ) {
			x = x / y ;
		} else {
			x = x % y ;
		}
		System.out.print( x );
		scan.close();
	}
}