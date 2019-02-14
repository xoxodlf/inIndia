package structure;

import java.util.Scanner;

class circlet{
	int size;
	int front=0;
	int rear=0;
	int queue[];
	int numOfValue=0;
	circlet(){}
	circlet(int size){
		this.size=size;
		queue=new int[size];
	}
	int howManyValue() {
		return numOfValue;
	}
	
	void push(int value) {
		if(isFull()) {
			System.out.println("Circlet is full");
			return;
		}
		queue[rear++]=value;
		rear=rear%size;
		numOfValue++;
	}
	void showCircle() {
		for(int i=front;i<front+numOfValue;i++)
			System.out.print(queue[i%size]+ " ");
		System.out.println("");
	}
	
	String pop() {
		int preIndex;
        if (isEmpty())
            return "Circlet is empty";
        else {
            preIndex = front;
            front=++front%size;
        }
        numOfValue--;
        return ""+queue[preIndex];
	}
	boolean isFull() {
		if(numOfValue==size-1) return true;
		else return false;
	}
	boolean isEmpty() {
		if(numOfValue==0) return true;
		else return false;
	}
}
public class circletEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Circlet's size");
		circlet c= new circlet(sc.nextInt());
		boolean re=true;
		while(re) {
			System.out.println("");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. list");
			System.out.println("4. how many value");
			System.out.println("5. size");
			System.out.println("6 is_empty");
			System.out.println("break");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				c.push(sc.nextInt());
				break;
			case 2:
				System.out.println(c.pop());
				break;
			case 3:
				c.showCircle();
				break;
			case 4:
				System.out.println(c.howManyValue());
				break;
			case 5:
				System.out.println(c.size);
				break;
			case 6:
				if(c.isEmpty())System.out.println("Empty");
				else System.out.println("Not Empty");
				break;
			default:
				re=false;
			}
		}
	}

}
