package A20180127;
interface shape{
	double area();
}
class circle implements shape{
	int radius;
	circle(int radius){
		this.radius=radius;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}
	
}

class ractangle implements shape{
	int width;
	int height;
	ractangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	public double area() {
		return width*height;
	}
}

public class demo {

	public static void main(String[] args) {
		circle c=new circle(4);
		System.out.println(c.area());
		ractangle r=new ractangle(4,5);
		System.out.println(r.area());
	}

}
