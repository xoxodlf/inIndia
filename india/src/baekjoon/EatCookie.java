/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : EatCookie.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 16.  
 * 
 */
package baekjoon;

/**
 * 
 * @Package : baekjoon
 * @FileName : EatCookie.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 16. 
 * 
 */
public class EatCookie
{
	static int max=0;
	public void eatCookie(int []cookies){
		eatCookie1(cookies,0,1);
	}
  public void eatCookie1(int []cookies,int k,int cnt){
		for(int i=k+1;i<cookies.length;i++) {
			if(cookies[k]<cookies[i]) {
				eatCookie1(cookies,i,cnt+1);
			}
		}
		if(max<cnt)max=cnt;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		EatCookie e = new EatCookie();
		int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
		e.eatCookie(cookies);
		System.out.println(max);
	}
}
