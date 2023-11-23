
public class ExampleGetArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 1.1;
		double area1, area2;
		
		Header(); //void method
		area1 = getArea(radius);
		System.out.println("Area 1 is " + area1);
		
		area2 = getArea(2.2);
		System.out.println("Area 2 is " + area2);
		
		System.out.println("Area 3 is " + getArea(3.3));
	}

	public static double getArea(double _radius) {
		double area = Math.PI * _radius * _radius;
		return area;
	}
	
	public static void Header() {
		System.out.println("*******************************");
	}
}
