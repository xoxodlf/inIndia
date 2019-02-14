/**
 * @Summary   : 
 * @Package : kakao
 * @FileName : apitch.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 17.  
 * 
 */
package kakao;

/**
 * 
 * @Package : kakao
 * @FileName : apitch.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 17. 
 * 
 */

class Solution {
	 
    boolean[][] isPass;
    int[][] picture;
    int w;
    int h;
    int size;
	  public int[] solution(int m, int n, int[][] picture) {
         int numberOfArea = 0;
         int maxSizeOfOneArea = 0;
		  h=m;
		  w=n;
		  isPass=new boolean[m][n];
		  this.picture=picture;
		  System.out.println("numofarea"+numberOfArea);
		  for(int i=0;i<m;i++) {
			  for(int j=0;j<n;j++) {
				  size=0;
				  if(!isPass[i][j]&&picture[i][j]!=0) {
					  numberOfArea++;
                     System.out.println("numofarea"+numberOfArea);
					  find(i, j, picture[i][j]);
					  if(maxSizeOfOneArea<size) maxSizeOfOneArea=size;
				  }
			  }
		  }
		  
		  
	      int[] answer = new int[2];
	      answer[0] = numberOfArea;
	      answer[1] = maxSizeOfOneArea;
	      return answer;
	  }
	  
	  void find(int i,int j,int color) {
		  if(i<0||i>=h){
             return;
         } 
         if(j<0||j>=w){
             return;
         } 
         if(isPass[i][j]){
             return;
         } 
		  else {
			 if(picture[i][j]==color) {
				 size++;
				 System.out.println("size"+size);
				 isPass[i][j]=true;
				 find(i,j+1,color);
				 find(i,j-1,color);
				 find(i+1,j,color);
				 find(i-1,j,color);
			 }else return;
		  }
	  }
	  
}

public class apitch {
	public static void main(String args[]) {
		Solution a= new Solution();
		int [][]b= {{0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
					{0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
					{0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
					{0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
					{0,1,1,1,1,2,1,1,1,1,2,1,1,1,1,0},
					{0,1,1,1,2,1,2,1,1,2,1,2,1,1,1,0},
					{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
					{0,1,3,3,3,1,1,1,1,1,1,3,3,3,1,0},
					{0,1,1,1,1,1,2,1,1,2,1,1,1,1,1,0},
					{0,0,1,1,1,1,1,2,2,1,1,1,1,1,0,0},
					{0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
					{0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0}};
		int c[]=a.solution(13,16,b);
		System.out.println(c[0]+ " " +c[1]);
	}
}
