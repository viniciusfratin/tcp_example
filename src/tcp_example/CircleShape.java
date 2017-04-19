package tcp_example;

public class CircleShape implements GeometricShape {
	private double radius;
	
	CircleShape(double radius) {
		this.radius = radius;
	}
	
	//from GeometricShape
	public double getPerimeter() {
		return 2 * Math.PI * getRadius();
	}
	
	//from GeometricShape
	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return String.format(
				"Circle: \n\tRadius = %1$.3f \n\tPerimeter = %2$.3f \n\tArea = %3$.3f\n",
				getRadius(), getPerimeter(), getArea());
	}
}
