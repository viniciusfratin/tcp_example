package tcp_example;

public class TestGeometricClasses {

	public static void main(String[] args) {
		RectangleShape rectangle = new RectangleShape(10, 20);
		SquareShape square = new SquareShape(30);
		TriangleShape triangle = new TriangleShape(3, 4, 5);
		CircleShape circle = new CircleShape(1);
		
		System.out.println("Testing classes:");
		System.out.println(rectangle.toString());
		System.out.println(square.toString());
		System.out.println(triangle.toString());
		System.out.println(circle.toString());
	}

}
