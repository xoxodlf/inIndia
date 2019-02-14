package J20180129;

import java.util.Scanner;

class RAT{
	int height;
	RAT(int height){
		this.height=height;
	}
	void draw(){
		for(int i=1;i<=height;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
}
public class rightAngleTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RAT a= new RAT(sc.nextInt());
		a.draw();
	}

}
