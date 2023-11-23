
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_Shape shape = new _Rectangle(2, 3);
		System.out.println("Area of Rectangle = " + shape.area());
		shape.draw();
		
		shape = new _Circle(2);
		System.out.println("Area of Circle = " + shape.area());
		shape.draw();

	}

}
