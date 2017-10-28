// Student: Mahbub Rahman

public class SomeClass {
	public static void main(String[] args) {
		try { 
			System.out.println("Gonna call someMethod() now...");
			someMethod(); 
		} 
		catch (Exception e) { 
			e.printStackTrace();
		} 
	}

	public static void someMethod() throws Exception {
		try { 
			someMethod2(); 
		}
		catch (Exception e)	{
			throw new Exception(e);
		}
	}

	public static void someMethod2() throws Exception {
		throw new Exception("Exception thrown in someMethod2");
	}
}