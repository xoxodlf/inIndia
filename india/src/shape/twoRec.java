package shape;

import java.util.Scanner;

class point{
	int x;
	int y;
	point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
public class twoRec {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 사각형");
		int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
		int tmp;
		if(x1>x2) {
			tmp=x1;
			x1=x2;
			x2=tmp;
		}
		if(y1>y2) {
			tmp=y1;
			y1=y2;
			y2=tmp;
		}
		point r1ld= new point(x1,y1);
		point r1ru= new point(x2,y2);
		System.out.println("두번째 사각형");
		x1=sc.nextInt();y1=sc.nextInt();x2=sc.nextInt();y2=sc.nextInt();
		if(x1>x2) {
			tmp=x1;
			x1=x2;
			x2=tmp;
		}
		if(y1>y2) {
			tmp=y1;
			y1=y2;
			y2=tmp;
		}
		point r2ld= new point(x1,y1);
		point r2ru= new point(x2,y2);
		int lx= r1ld.x>r2ld.x?r2ld.x:r1ld.x;
		int ly= r1ld.y>r2ld.y?r2ld.y:r1ld.y;
		int bx= r1ru.x>r2ru.x?r2ru.x:r1ru.x;
		int by= r1ru.y>r2ru.y?r2ru.y:r1ru.y;
		int cntX=0,cntY=0;
			for(int i=lx;i<=bx;i++) {
				if(i>=r1ld.x&&i<=r1ru.x&&i>=r2ld.x&&i<=r2ru.x)cntX++;
			}
			for(int i=ly;i<=by;i++) {
				if(i>=r1ld.y&&i<=r1ru.y&&i>=r2ld.y&&i<=r2ru.y)cntY++;
			}
			System.out.println(cntX+" "+cntY);
			if((cntX-1)*(cntY-1)<=0) System.out.println("안겹쳐.");
			else System.out.println("넓이 = "+(cntX-1)*(cntY-1));
	}
}
