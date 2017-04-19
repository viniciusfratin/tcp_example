package tcp_example;

public class TriangleShape implements GeometricShape {
	private double sideA;
	private double sideB;
	private double sideC;
	
	TriangleShape(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	//from GeometricShape
	public double getPerimeter() {
		return getSideA() + getSideB() + getSideC();
	}
	
	//from GeometricShape
	public double getArea() {
		double halfPerimeter = getPerimeter() / 2;
		
		double[] innerFactors = new double[4];
		innerFactors[0] = halfPerimeter;
		innerFactors[1] = halfPerimeter - getSideA();
		innerFactors[2] = halfPerimeter - getSideB();
		innerFactors[3] = halfPerimeter - getSideC();
		
		double innerFactor = 1;
		for(int index = 0; index < 4; index++) {
			innerFactor *= innerFactors[index];
		}
		
		double area = Math.sqrt(innerFactor);
		
		return area;
	}
	
	public double getSideA() {
		return this.sideA;
	}
	
	public double getSideB() {
		return this.sideB;
	}
	
	public double getSideC() {
		return this.sideC;
	}
	
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public String toString() {
		return String.format(
				"Triangle: \n\tSides = %1$.3f %2$.3f %3$.3f \n\tPerimeter = %4$.3f \n\tArea = %5$.3f\n",
				getSideA(), getSideB(), getSideC(), getPerimeter(), getArea());
	}
}
