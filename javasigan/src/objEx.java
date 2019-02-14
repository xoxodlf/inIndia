abstract class Stack{
	abstract int length();
	abstract public Object pop();
	abstract public boolean push(Object obj);
}
class dhwlddj{
	int a=3;
	double dhwld() {
		return 1.0;
	}
	void dhwldwld(int a[]) {
		a[0]=5;
	}
}
public class objEx extends Stack {

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean push(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String args[]) {
		int a[]= new int[10];
		dhwlddj b= new dhwlddj();
		b.dhwldwld(a);
		System.out.println(a[0]);
	}
}
