package J20180129;

import java.util.Scanner;

class numM{
	int value;
	numM(int value){this.value=value;}
	void printOut() {
		for(int i=0;i<=value;i++) {
			for(int j=0;j<=value;j++) {
				System.out.print(i+ "*" +j+" = "+i*j+" ");
			}System.out.println("");
			
		}
	}
}

public class Multi {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		numM a=new numM(sc.nextInt());
		a.printOut();
	}

}
