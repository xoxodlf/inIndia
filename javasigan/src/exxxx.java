class SuperObject{
	public void paint() {
		System.out.println("��������Ʈ");
		draw();
	}
	public void draw() {
		System.out.println("���۵�ο�");
		draw();
		System.out.println("���ۿ�����Ʈ");
	}
}
class SubObject extends SuperObject{
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("���������Ʈ");
	}
}
public class exxxx{
	public static void main(String args[]) {
		SuperObject b= new SubObject();
		b.paint();
	}
}