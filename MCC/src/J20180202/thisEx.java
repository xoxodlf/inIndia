package J20180202;
class Account{
	int a;
	int b;
	public void setData(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void showData() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class thisEx {

	public static void main(String[] args) {
		Account a= new Account();
		a.setData(1, 3);
		a.showData();
	}

}
