package Baseball;

public class Baseball {
	
	public static void main(String args[]){
		int array[]= new int[9];
		int cnt=0;
		for(int i=0;i<9;i++) {
			while(true) {
				array[i]=(int)(Math.random()*9+1);
				for(int j=0; j<i;j++) {
					if(array[j]!=array[i]) {
						cnt++;
					}
				}
				if(cnt==i)break;
				cnt=0;
			}
			cnt=0;
			System.out.println(array[i]);
		}
	}
}
