package structure;

import java.util.Scanner;

class nodeTree{
	nodeTree left;
	int value;
	nodeTree right;
	int floor;
	int topFloor;
	nodeTree(int value){
		this.value=value;
	}
	nodeTree(){};
	int get() {
		return value;
	}
	
	
	void showTree(int cnt){
		if(cnt==1) System.out.print("root is ");
		System.out.println(value);
		floor=cnt;
		if(left!=null) {
			System.out.print("left of "+value+", ");
			left.showTree(cnt+1);
		}
		if(right!=null) {
			System.out.print("right of "+value+", ");
			right.showTree(cnt+1);
		}
		binaryTreeEx.topFloor=binaryTreeEx.topFloor>cnt?binaryTreeEx.topFloor:cnt;
		return;
	}
}

public class binaryTreeEx {
	static int topFloor=0;
	
	public static void makeArry(nodeTree a,int index,int tree[][],boolean NotNull[][],int w,int first) {
		tree[a.floor-1][index]=a.value;
		NotNull[a.floor-1][index]=true;
		if(a.left==null&&a.right==null) return;
		if(a.left!=null) makeArry(a.left,(first+index)/2,tree,NotNull,index,first);
		if(a.right!=null) makeArry(a.right,(index+w)/2,tree,NotNull,w,index);
		return;	
	}
	
	public static void drawTree(nodeTree a) {
		int w=(int)Math.pow(2, topFloor);
		int tree[][]=new int[topFloor][w+1];
		boolean NotNull[][]=new boolean[topFloor][w+1];
		makeArry(a,w/2,tree,NotNull,w,0);
		for(int i=0;i<topFloor;i++) {
			for(int j=0;j<w+1;j++) {
				if(NotNull[i][j])System.out.print(" "+tree[i][j]+"");
				else System.out.print("  ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Start tree");
		nodeTree root=new nodeTree();
		nodeTree newNode=new nodeTree();
		nodeTree findNode=new nodeTree();
		int size=0;
		boolean re=true;
		while(re) {
			System.out.println("");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. list");
			System.out.println("4. size");
			System.out.println("5 is_empty");
			System.out.println("other break");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				if(size==0) {
					newNode=new nodeTree(sc.nextInt());
					root=newNode;
					size++;
				}else {
					int value=sc.nextInt();
					findNode=root;
					while(findNode!=null) {
						if(findNode.get()==value) {
							System.out.println("aleady in tree");
							break;
						}
						if(findNode.get()>value) {
							if(findNode.left==null) {
								newNode= new nodeTree(value);
								findNode.left=newNode;
								size++;
								break;
							}else findNode=findNode.left;
						}else {
							if(findNode.right==null) {
								newNode= new nodeTree(value);
								findNode.right=newNode;
								size++;
								break;
							}else findNode=findNode.right;
						}
					}
					
				}break;
			case 2:
				if(size==0) {
					System.out.println("No data");
					break;
				}else {
					int value=sc.nextInt();
					findNode=root;
					boolean isRight = true;
					nodeTree upNode=new nodeTree();
					nodeTree tempNode=new nodeTree();
					nodeTree tempUp=new nodeTree();
					upNode.right=findNode;
					while(findNode!=null) {
						if(value==findNode.get()) {
							System.out.println(value);
							if(!isRight) {
								if(findNode.right==null) {
									upNode.left=findNode.left;
									break;
								}else {
									int cnt=0;
									tempUp=findNode;
									tempNode=findNode.right;
									while(tempNode!=null) {
										if(tempNode.left!=null) {
											tempUp=tempNode;
											tempNode=tempNode.left;
											cnt++;
										}else {
											if(cnt==0) {
												upNode.left=tempNode;
												tempNode.left=findNode.left;
												break;
											}
											upNode.left=tempNode;
											tempUp.left=tempNode.right;
											tempNode.right=findNode.right;
											tempNode.left=findNode.left;
											break;
										}
									}
								}
								break;
							}else {
								if(findNode.left==null) {
									upNode.right=findNode.right;
									break;
								}else {
									int cnt=0;
									tempUp=findNode;
									tempNode=findNode.left;
									while(tempNode!=null) {
										if(tempNode.right!=null) {
											tempUp=tempNode;
											tempNode=tempNode.right;
											cnt++;
										}else {
											if(cnt==0) {
												upNode.right=tempNode;
												tempNode.right=findNode.right;
												break;
											}
											upNode.right=tempNode;
											tempUp.right=tempNode.left;
											tempNode.right=findNode.right;
											tempNode.left=findNode.left;
											break;
										}
									}
								}
								break;
							}
						}else {
							if(findNode.get()>value) {
								if(findNode.left==null) {
									System.out.println("No "+value+" in the tree");
									break;
								}
								upNode=findNode;
								isRight=false;
								findNode=findNode.left;
							}else {
								if(findNode.right==null) {
									System.out.println("No "+value+" in the tree");
									break;
								}
								upNode=findNode;
								isRight=true;
								findNode=findNode.right;
							}
						}
					}
				}break;
			case 3:
				System.out.println("list....");
				root.showTree(1);
				drawTree(root);		
				break;
			case 4:
				System.out.println(size);
				break;
			case 5:
				if(size==0)System.out.println("Empty");
				else System.out.println("Not Empty");
				break;
			default:
				System.out.println("shut down");
				re=false;
			}
			
		}
	}

}
