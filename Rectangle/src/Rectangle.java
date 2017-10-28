// Student: Mahbub Rahman

public class Rectangle {
	private float length, width;
	
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	public void setLength(float length) {
		if (length > 0.0 && length < 20.0)
			this.length = length;
	}
	
	public void setWidth(float width) {
		if (width > 0.0 && width < 20.0)
			this.width = width;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public float showPerimeter() {
		return 2 * (length + width);
	}
	
	public float showArea() {
		return length * width;
	}
}
