/**
 * @Summary   : 
 * @Package : J20180213
 * @FileName : lotateArray.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 13.  
 * 
 */
package J20180213;

import java.util.Scanner;

abstract class lotateAb{
	int originArray[][];
	lotateAb(int [][]originArray){
		this.originArray=originArray;
	}
	abstract void lotate();
	abstract void print();
}

class lotate extends lotateAb{
	
	int[][] lotatedArray;
	int sum =0;
	lotate(int[][] originArray) {
		super(originArray);
		
	}
	
	

	@Override
	void lotate() {
		lotatedArray=new int[originArray.length][originArray.length];
		for(int i=0;i<lotatedArray.length;i++) {
			for(int j=0;j<lotatedArray.length;j++) {
				lotatedArray[i][j]=originArray[lotatedArray.length-1-j][i];
				if((i==0&&j==0)||(i==0&&j==originArray.length-1)||(i==originArray.length-1&&j==0)||(i==originArray.length-1&&j==originArray.length-1))
					sum=sum+lotatedArray[i][j];
			}
		}
		print();
		
	}


	@Override
	void print() {
		
		for(int i=0;i<lotatedArray.length;i++) {
			for(int j=0;j<lotatedArray.length;j++) {
				System.out.print(originArray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<lotatedArray.length;i++) {
			for(int j=0;j<lotatedArray.length;j++) {
				System.out.print(lotatedArray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("sum of edge num is "+sum);
	}
	
}


/**
 * 
 * @Package : J20180213
 * @FileName : lotateArray.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 13. 
 * 
 */
public class lotateArray {

	/**
	 * 
	 *
	 * @Method Name : main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int[][] origin = new int[m][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				origin[i][j]=sc.nextInt();
			}
		}
		lotate a= new lotate(origin);
		a.lotate();

	}

}
