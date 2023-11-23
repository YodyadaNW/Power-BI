
abstract public class Shape {
	private String name;

	Shape(String name) {
		this.name = name;
	}

	public void moveTo(int x, int y) {
		System.out.println(name + " move to x=" + x + ", y=" + y);
	}

	abstract public double area();
	abstract public void draw();

}
