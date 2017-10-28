// Student: Mahbub Rahman

public class TrafficLightTest {

	public static void main(String[] args) {
		System.out.println("Traffic Light and duration:");
		
		for (TrafficLight light : TrafficLight.values())
			System.out.printf("%n%-7s%3d", light, light.getDuration());
	}

}
