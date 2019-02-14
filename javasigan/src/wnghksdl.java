import java.util.Scanner;   
   class Circle {
      int radius;
      public void set(int radius) {
            this.radius = radius;
      }
   }
   
   class Sphere extends Circle{
	   public void set(int radius) {
		   super.radius=radius;
	   }
	   public double getVolume() {
		   return radius*radius*radius*4/3*Math.PI;
	   }
   }
   
   class Cylinder extends Circle{
	  int height;
      public void set(int height,int radius) {
    	  this.height=height;
    	  super.radius=radius;
      }
      public double getVolume() {
    	  return radius*radius*Math.PI*height;
      }
   }   
   
public class wnghksdl {      
   public static void main(String[] args) {
      Scanner a = new Scanner(System.in);
      System.out.print("반지름 = ");
      int radius = a.nextInt();
      System.out.print("높이 = ");
      int height = a.nextInt();
      
      Circle ci = new Circle();
      ci.set(radius);
      
      Cylinder cy = new Cylinder();
      cy.set(height, radius);
      Sphere sp = new Sphere();
      sp.set(radius);
      
      System.out.println(cy.getVolume());
      System.out.println(sp.getVolume());
   }
}