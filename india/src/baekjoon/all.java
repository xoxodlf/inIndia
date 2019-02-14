/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : all.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 16.  
 * 
 */
package baekjoon;

import java.util.ArrayList;

/**
 * 
 * @Package : baekjoon
 * @FileName : all.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 16. 
 * 
 */
public class all {
	public static void main(String[] args) {
		soool s = new soool();
		System.out.println(s.solution("011"));
	}
}

class soool{
	char[] ca;
	ArrayList<Integer> al = new ArrayList<>();
	public int solution(String numbers) {
        ca= numbers.toCharArray();
		recu("",new boolean[ca.length]);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
        return al.size();
    }
	
	void recu(String prev,boolean[] pass) {
		if(prev.length()>0&&isPrime(Integer.parseInt(prev))&&!al.contains(Integer.parseInt(prev))) {
			al.add(Integer.parseInt(prev));
		}
			
		if(prev.length()==ca.length) {
			return;
		}
		boolean[] passN = pass.clone();
		for(int i=0;i<ca.length;i++) {
			if(!passN[i]) {
				passN[i]=true;
				recu(prev+ca[i],passN);
				passN[i]=false;
			}
		}
	}
	
	void swap(int i, int j, char[] ca){
		char tmp = ca[i];
		ca[i] = ca[j];
		ca[j] = tmp;
	}
	
	boolean isPrime(int num) {
		if(num<2) return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
}
