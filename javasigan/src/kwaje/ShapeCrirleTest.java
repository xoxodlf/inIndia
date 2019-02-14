package kwaje;

import java.util.Scanner;




class Cylinder extends ShapeA.Circle{
	private double height;
	public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
	}
	public void showVolume() {
		System.out.println("원기둥 부피: "+getRadius()*getRadius()*Math.PI*height);
	}
}

class Sphere extends ShapeA.Circle{
	public Sphere(double radius) {
		super(radius);
	}
	public void showVolume() {
		System.out.println("구 부피: "+getRadius()*getRadius()*getRadius()*Math.PI*4/3);
	}
}

public class ShapeCrirleTest{
		public static void main(String[] args) {
			ShapeA.Circle aCircle = new ShapeA.Circle(3);
			aCircle.showArea();
			Scanner sc = new Scanner(System.in);
			
			Cylinder cylinder=new Cylinder(sc.nextInt(),sc.nextInt());
			Sphere sphere=new Sphere(sc.nextInt());
			cylinder.showVolume();
			sphere.showVolume();
			
		}
}
