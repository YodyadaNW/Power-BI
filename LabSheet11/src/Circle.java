
public class Circle extends Shape{
	private int radius;
	
	Circle(int radius, String name){
		super(name);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle has been draw.");
	}
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
