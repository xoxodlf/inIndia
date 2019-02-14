package structure;

import java.util.Scanner;

class stack{
	int sizeOfStack;
	int top=-1;
	int array[];
	stack(int n){
		array=new int[n];
		sizeOfStack=n;
	}
	void push(int n) {
		if(top+1==sizeOfStack)System.out.println("stack full");
		else array[++top]=n;
	}
	void pop() {
		if(top==-1) System.out.println("no data");
		else System.out.println(array[top--]);
	}
	int size() {
		return sizeOfStack;
	}
	boolean isEmpty() {
		if(top==-1)return true;
		else return false;
	}
	int whereIsTop() {
		return top;
	}
	void showStack() {
		for(int i=top;i>=0;i--) {
			System.out.println(array[i]);
		}
	}
	
}

public class stackEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Stack's size");
		stack s= new stack(sc.nextInt());
		boolean re=true;
		while(re) {
			System.out.println("");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. list");
			System.out.println("4. where is top");
			System.out.println("5. size");
			System.out.println("6 is_empty");
			System.out.println("break");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				s.push(sc.nextInt());
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.showStack();
				break;
			case 4:
				System.out.println(s.whereIsTop());
				break;
			case 5:
				System.out.println(s.size());
				break;
			case 6:
				if(s.isEmpty())System.out.println("Empty");
				else System.out.println("Not Empty");
				break;
			default:
				re=false;
			}
		}

	}

}
