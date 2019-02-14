package Shape;

class Shape {
	public Shape next;
	public double getArea() {
		return 0;
	}
}
class Circle extends Shape{
	public double radius;
	
	public Circle  (double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}

class Triangle extends Shape{
	private double height;
	private double width;
	
	public Triangle(double height, double width) {
		this.height=height;
		this.width=width;
	}
	public double getArea() {
		return 0.5*height*width;
	}
}

class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(double height, double width) {
		this.height=height;
		this.width=width;
	}
	public double getArea() {
		return height*width;
	}
}

class Line extends Shape{
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	public Line(double x1, double y1, double x2, double y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public double getArea() {
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
}

class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public double getVolume() {
		return super.getArea()*height;
	}

}

class Sphere extends Circle{
	
	public Sphere(double radius) {
		super(radius);
	}
	public double getVolume() {
		return super.getArea()*radius*4/3;
	}

}

class Cone extends Circle{
	private double height;
	
	public Cone(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public double getVolume() {
		return super.getArea()*height/3;
	}

}

public class ShapeEx{
	public static void main(String args[]) {
		Circle a= new Circle(3);
	
		
		Triangle b= new Triangle(3,6);
		
		
		Rectangle c= new Rectangle(3,8);
		Cylinder d = new Cylinder(4,3);
		Sphere e = new Sphere(3);
		Cone f = new Cone(4,3);
		a.next=b;
		b.next=c;

		
		Shape start = a;
		Shape p= start;
		while(p!=null) {
			System.out.println(p.getArea());
			p=p.next;
		}
		System.out.println(d.getVolume());
		System.out.println(e.getVolume());
		System.out.println(f.getVolume());
		
	}
}
