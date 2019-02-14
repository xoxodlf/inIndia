/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : word.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 9.  
 * 
 */
package baekjoon;

import java.util.ArrayList;

/**
 * 
 * @Package : baekjoon
 * @FileName : word.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 9. 
 * 
 */
public class word {
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String[] ss= {"hot", "dot", "dog", "lot", "log", "cog"};
		System.out.println(s.solution("hit", "cog", ss));
	}
}

class Solution1 {
	String begin;//hit
	String target;//cog
	String[] words;//[hot, dot, dog, lot, log, cog]
	
    public int solution(String begin, String target, String[] words) {
    	this.begin=begin;
    	this.target=target;
    	this.words=words;
        int answer = 0;
        answer = change(begin,0,new boolean[words.length]);
        return answer;
    }
    
    public int change(String now,int cnt,boolean[] recvArr) {
    	if(now.equals(target)) return cnt;
    	boolean[] arr= new boolean[recvArr.length];
    	int result=0;
    	for(int i=0;i<recvArr.length;i++) {
    		arr[i]=recvArr[i];
    	}
    	for(int i=0; i<words.length;i++) {
    		int mat=0;
    		if(!arr[i]) {
    			for(int j=0;j<begin.length();j++) {
        			if(words[i].charAt(j)==now.charAt(j))mat++;
        		}
    			if(mat==begin.length()-1) {
    				arr[i]=true;
    				int tmp=change(words[i], cnt+1,arr);
    				if(tmp!=0) {
    					if(result==0)result=tmp;
    					else result=result<tmp?result:tmp;
    				}
    			}
    		}
    	}
    	return result;
    }
}
