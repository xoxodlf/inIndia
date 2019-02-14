package kwaje;

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

class PrimeNumber{
	private int value;
	public PrimeNumber(int value) {
		this.value=value;
	}
	public boolean isPrime() {
		int cnt=0;
		for(int i=2;i<=value;i++) {
			if(value%i==0) cnt++;
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
}

public class kwaje {
	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}
	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}
	
	public static void main(String args[]) {
		MyInteger a= new MyInteger(3);
		
		System.out.println(a.isEven());
		System.out.println(a.isOdd());
		System.out.println(a.equals(4));
		System.out.println(a.equals(a));
		
		PrimeNumber b= new PrimeNumber(10);
		
		System.out.println(b.isPrime());
		System.out.println(b.isPrime(5));
		
		for(int i=1; i<=50;i++) {
			System.out.println(i+"이(가) 소수 입니까? "+b.isPrime(i));
		}
	}
	
}
