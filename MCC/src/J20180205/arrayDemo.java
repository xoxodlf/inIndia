package J20180205;

public class arrayDemo {
	public static void mais(String args[]) {
		int array[]=new int[7];
		for(int cnt=0;cnt<7;cnt++) {
			array[cnt]=cnt+1;
		}
		for(int cnt=0;cnt<7;cnt++) {
			System.out.println("array["+cnt+"]="+array[cnt]);
		}
		//array[8]=10;
	}
	
}
