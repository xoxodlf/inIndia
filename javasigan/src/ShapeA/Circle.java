package ShapeA;

public class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius =radius;
	}
	public double getRadius() {
		return radius;
	}
	public void showArea() {
		System.out.println("¿ø ¸éÀû: "+radius*radius*Math.PI);
	}
}
