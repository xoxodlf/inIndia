/**
 * @Summary   : 
 * @Package : recusion
 * @FileName : zSeek.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 12.  
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * z형태로 탐색할 배열을 만들고, 탐색하는 메소드가 들어있는 클래스 
 * 
 * @Package : recursion
 * @FileName : zSeek.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 12. 
 *
 */
class zArray{
	int n;
	int w;
	int findX,findY;
	int cnt=-1;
	boolean flag=false;
	zArray(int n,int y, int x){
		this.n=n;
		this.w=(int)Math.pow(2, n);
		findY=y;
		findX=x;
	}
	
	/**
	 * 
	 * 탐색을하면서 찾는 알고리즘
	 *
	 * @Method Name : zFind
	 * @param x 
	 * @param y 
	 * @param width 넓이가 1일때 출력하기위함.
	 */
	void zFind(int x,int y,int width) { 
		if(width==1) {
			cnt++;
			if(x==findX&&findY==y) {
				System.out.println(cnt);
				flag=true;
			}
			return;
		}
		if(flag)return;
		zFind(x,y,width/2);
		zFind(x+width/2,y,width/2);
		zFind(x,y+width/2,width/2);
		zFind(x+width/2,y+width/2,width/2);
		return;
	}
}

/**
 * 
 * @Package : recursion
 * @FileName : zSeek.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 12.
 * 
 */
public class zSeek {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		zArray z= new zArray(sc.nextInt(),sc.nextInt(),sc.nextInt());
		z.zFind(0, 0,z.w);
	}

}
