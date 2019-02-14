class SuperObject{
	public void paint() {
		System.out.println("슈퍼페인트");
		draw();
	}
	public void draw() {
		System.out.println("슈퍼드로우");
		draw();
		System.out.println("슈퍼오브젝트");
	}
}
class SubObject extends SuperObject{
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("서브오브젝트");
	}
}
public class exxxx{
	public static void main(String args[]) {
		SuperObject b= new SubObject();
		b.paint();
	}
}