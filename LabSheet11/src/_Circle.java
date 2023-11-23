
public class _Circle implements _Shape{
private int radius;
	
	_Circle(int radius){
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
