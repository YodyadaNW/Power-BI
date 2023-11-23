
public class Rectangle extends Shape{
	private int length;
	private int width;
	
	Rectangle(int length, int width, String name){
		super(name);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		return (double)(length*width);
	}
	@Override
	public void draw() {
		System.out.println("Rectangle has been draw.");
	}

}
