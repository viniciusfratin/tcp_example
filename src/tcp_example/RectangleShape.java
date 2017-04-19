package tcp_example;

public class RectangleShape implements GeometricShape {
	private double base;
	private double height;
	
	RectangleShape(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	//From GeometricShape.
	public double getPerimeter() {
		return 2 * (getBase() + getHeight());
	}
		
	//From GeometricShape.
	public double getArea() {
		return getBase() * getHeight();
	}	
		
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String toString() {
		return String.format(
				"Rectangle: \n\tBase = %1$.3f \n\tHeight = %2$.3f \n\tPerimeter = %3$.3f \n\tArea = %4$.3f\n",
				getBase(), getHeight(), getPerimeter(), getArea());
	}
}
