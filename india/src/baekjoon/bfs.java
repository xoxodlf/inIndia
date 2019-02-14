/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : bfs.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 8.  
 * 
 */
package baekjoon;

/**
 * 
 * @Package : baekjoon
 * @FileName : bfs.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 8. 
 * 
 */
public class bfs {
	int answer=0;
	int target;
	int[] numbers;
	
	bfs(int target, int[]numbers){
		this.target=target;
		this.numbers=numbers;
	}
	
	public void cal(int i,int sum) {
		if(numbers.length==i) {
			if(sum==target)answer++;
			return;
		}
		cal(i+1,sum+numbers[i]);
		cal(i+1,sum-numbers[i]);
	}
}
