package structure;

import java.util.Scanner;

class nodeT{
	int grade;
	nodeT left;
	nodeT right;
	nodeT next;
	int value;
	int floor;
	nodeT(int value){
		this.value = value;
	}
	nodeT(){
	}
	
	
}

public class numTri {
	public static int findMax(nodeT now) {
		if(now.left==null)return now.value;
		else {
			if(findMax(now.left)>findMax(now.right)) {
				return findMax(now.left)+now.value;
			}
			else
				return findMax(now.right)+now.value;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int floor=1;
		int cnt=0;
		nodeT first=new nodeT();nodeT newNode=new nodeT();nodeT createNode=new nodeT(); 
		for(int i=1;i<=n;i++) sum=sum+i;
		for(int i=0; i<sum;i++) {
			if(i==0) {
				newNode=new nodeT(sc.nextInt());
				newNode.grade=i+1;
				newNode.floor=floor;
				first=newNode;
				createNode=newNode;
			}else {
				createNode.next=new nodeT(sc.nextInt());
				createNode.next.grade=i+1;
				createNode.next.floor=floor;
				createNode=createNode.next;
			}
			cnt++;
			if(floor==cnt) {
				floor++;
				cnt=0;
			}
		}
		nodeT now=new nodeT();
		nodeT find=new nodeT();
		for(int i=1;i<=sum-n;i++) {
			now=first;
			find=first;
			while(find!=null) {
				if(find.grade==now.floor+now.grade) {
					now.left=find;
					now.right=find.next;
				}
				find=find.next;
			}
			now=now.next;
		}
		sum=0;
		System.out.println(findMax(first));
		
		
	}

}
