// Student: Mahbub Rahman

public class Complex {
	private float realPart, imaginaryPart;

	public Complex() {
		this(0, 0);
	}

	public Complex(float realPart, float imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public void setRealPart(float realPart) {
		this.realPart = realPart;
	}

	public float getRealPart() {
		return realPart;
	}

	public void setImaginaryPart(float imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	public float getImaginaryPart() {
		return imaginaryPart;
	}

	public Complex add(Complex addend) {
		Complex add = new Complex();
		add.setRealPart(this.getRealPart() + addend.getRealPart());
		add.setImaginaryPart(this.getImaginaryPart() + addend.getImaginaryPart());
		return add;
	}

	public Complex sub(Complex subtrahend) {
		Complex sub = new Complex();
		sub.setRealPart(this.getRealPart() - subtrahend.getRealPart());
		sub.setImaginaryPart(this.getImaginaryPart() - subtrahend.getImaginaryPart());
		return sub;
	}

	public void printComplex() {
		System.out.printf("(%.4f, %.4f)", getRealPart(), getImaginaryPart());
	}

}
