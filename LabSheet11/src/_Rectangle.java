
public class _Rectangle implements _Shape{
	private int width;
	private int length;
	
	_Rectangle(int length, int width){
		this.length = length;
		this.width= width;
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle has been draw.");
	}
	@Override
	public double area() {
		return length*width;
	}

}
