package tcp_example;

public class SquareShape extends RectangleShape{
	SquareShape(double sideLength) {
		super(sideLength, sideLength);
	}
	
	public double getSideLength() {
		return super.getBase();
	}
	
	public void setSideLength(double sideLength) {
		super.setBase(sideLength);
		super.setHeight(sideLength);
	}
	
	public String toString() {
		return String.format(
				"Square: \n\tSide = %1$.3f \n\tPerimeter = %2$.3f \n\tArea = %3$.3f\n",
				getSideLength(), getPerimeter(), getArea());
	}
}
