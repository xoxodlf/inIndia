package structure;

import java.util.Scanner;

class nodeQ{
	int value;
	nodeQ next;
	nodeQ(){}
	nodeQ(int value){
		this.value=value;
	}
	int pop() {
		return value;
	}
}

public class queEx {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		nodeQ first=new nodeQ();
		nodeQ newNode=new nodeQ();
		nodeQ back=new nodeQ();
		int size=0;
		boolean re = true;
		while(re) {
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. list");
			System.out.println("4. size");
			System.out.println("5. is_empty");
			System.out.println("else. break");
			int n=sc.nextInt();
			switch(n) {
			case 1: 
				if(size==0) {
					newNode=new nodeQ(sc.nextInt());
					first=newNode;
					back=newNode;
				}else {
					newNode=new nodeQ(sc.nextInt());
					back.next=newNode;
					back=back.next;
				}
				size++;
				break;
			case 2: 
				if(size==0) {
					System.out.println("NO VALUE");
				}else {
					System.out.println(first.pop());
					first=first.next;
					size--;
				}break;
			case 3:
				newNode=first;
				while(newNode!=null) {
					System.out.print(newNode.pop()+" ");
					newNode=newNode.next;
				}System.out.println("");
				break;
			case 4:
				System.out.println(size);
				break;
			case 5:
				if(size==0)System.out.println("empty");
				else System.out.println("not empty");
				break;
			default:
				System.out.println("종료합니다.");
				re=false;
			}
			
		}

	}

}
