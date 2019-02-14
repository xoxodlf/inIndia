package structure;

import java.util.Scanner;

class nodeDQ{
	int value;
	nodeDQ next=null;
	void insert(int value) {
		this.value=value;
	}
	int pop(){
		return value;
	}
}

public class dequeEx {
	public static void main(String[] args) {
		nodeDQ front=new nodeDQ();
		nodeDQ newNode=new nodeDQ();
		nodeDQ start=new nodeDQ();
		nodeDQ back=new nodeDQ();
		nodeDQ findFN=new nodeDQ();
		int size=0;
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			String command=sc.next();
			if(command.equals("push_front")) {
				if(size==0) {
					newNode = new nodeDQ();
					newNode.insert(sc.nextInt());
					front=newNode;
					back=newNode;
					size++;
				}else {
					newNode = new nodeDQ();
					newNode.insert(sc.nextInt());
					newNode.next=front;
					front=newNode;
					size++;
				}
				
			}else if(command.equals("push_back")) {
				if(size==0) {
					newNode = new nodeDQ();
					newNode.insert(sc.nextInt());
					front=newNode;
					back=newNode;
					size++;
				}else {
					newNode = new nodeDQ();
					newNode.insert(sc.nextInt());
					back.next=newNode;
					back=newNode;
					size++;
				}
				
			}else if(command.equals("pop_front")) {
				if(size==0) {
					System.out.println(-1);
				}else {
					System.out.println(front.pop());
					front=front.next;
					size--;
				}
			}else if(command.equals("pop_back")) {
				if(size==0) {
					System.out.println(-1);
				}else {
					System.out.println(back.pop());
					findFN=front;
					while(findFN.next!=null) {
						if(findFN.next.next==null) {
							findFN=findFN.next;
							break;
						}	
					}
					back=findFN;
					back.next=null;
					size--;
				}
			}else if(command.equals("size")) {
				System.out.println(size);
			}else if(command.equals("empty")) {
				if(size==0)System.out.println(1);
				else System.out.println(0);
			}else if(command.equals("front")) {
				if(size==0) {
					System.out.println(-1);
				}else System.out.println(front.value);
			}else if(command.equals("back")) {
				if(size==0) {
					System.out.println(-1);
				}else System.out.println(back.value);
			}
		}
//		start=front;
//		while(start!=null) {
//			System.out.println(start.value);
//			start=start.next;
//		}
		
	}

}
