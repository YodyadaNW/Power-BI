
public class AbstractDemo {

	public static void main(String[] args) {
		Shape shape = new Rectangle(2, 3, "Rectangle");
		System.out.println("Area of Rectangle = " + shape.area());
		shape.moveTo(1, 2);
		System.out.println();
		shape = new Circle(2, "Circle");
		System.out.println("Area of Circle = " + shape.area());
		shape.moveTo(2, 4);
	}

}
