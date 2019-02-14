

class MyInteger{
	private int value;
	public MyInteger(int value) {
		this.value=value;
	}
	public int getInteger() {
		return this.value;
	}
	public boolean isEven() {
		if(this.value%2==0) return true;
		return false;
	}
	public boolean isOdd() {
		if(this.value%2!=0) return true;
		return false;
	}
	public boolean equals(int a) {
		if(this.value==a) return true;
		return false;
	}
	public boolean equals(MyInteger a) {
		if(this.value==a.value) return true;
		return false;
	}
}

interface PrimeNumber{
	
	public boolean isPrime();
	public boolean isPrime(int value);
	public boolean isPrime(MyInteger a);
}

class MyPrimeNumber extends MyInteger  implements PrimeNumber{
	public MyPrimeNumber(int value) {
		super(value);
	}
	public boolean isPrime() {
		int cnt=0;
		for(int i=2;i<=getInteger();i++) {
			if(getInteger()%i==0) cnt++;
			if(cnt>=2) return false;
		}
		if(cnt==1) return true;
		else return false;
	}
	
	public boolean isPrime(int value) {
		int cnt=0;
		for(int i=2;i<=value;i++) {
			if(value%i==0) cnt++;
			if(cnt>=2) return false;
		}
		if(cnt==1) return true;
		else return false;
	}
	
	public boolean isPrime(MyInteger a) {
		int cnt=0;
		for(int i=2;i<=a.getInteger();i++) {
			if(a.getInteger()%i==0) cnt++;
			if(cnt>=2) return false;
		}
		if(cnt==1) return true;
		else return false;
	}
}

public class kwaje {
	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}
	
	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}
	
	public static void main(String args[]) {
		MyPrimeNumber a = new MyPrimeNumber(3);
		System.out.println(a.equals(a));
		System.out.println(a.equals(0));
		System.out.println(a.isEven());
		System.out.println(a.isOdd());
		System.out.println(a.isPrime());
		System.out.println(a.isPrime(8));
		System.out.println(a.isPrime(a));
	}
	
	
}
