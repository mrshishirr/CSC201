// Student: Mahbub Rahman

public enum TrafficLight {
	RED(30),
	GREEN(30),
	YELLOW(3);

	private int duration;

	private TrafficLight(int duration) { // only private is allowed
		this.duration = duration;
	}
	
	// only accessor method provided
	public int getDuration() {
		return duration;
	}
}