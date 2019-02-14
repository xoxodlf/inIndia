/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : subkey.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 10.  
 * 
 */
package baekjoon;

import java.util.ArrayList;

/**
 * 
 * @Package : baekjoon
 * @FileName : subkey.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 10. 
 * 
 */
public class subkey {
	public static void main(String[] args) {
		Solutions s = new Solutions();
		String[][] ss= {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		s.solution(ss);
	}
}

class Solutions {
    
	String[][] relation;
	
	public int solution(String[][] relation) {
		this.relation=relation;
		int answer = 0;
		ArrayList<Integer> li;
		for(int i=0;i<relation[0].length;i++) {
			li =new ArrayList<Integer>();
			li.add(i);
			answer+=find(li);
		}
        
        return answer;
    }
	
	public int find(ArrayList<Integer> indexList) {
		for(int i=0;i<indexList.size();i++) {
			if(indexList.get(i)==relation[0].length)return 0;
		}
		ArrayList<Integer> local = (ArrayList<Integer>) indexList.clone();
		boolean flag=false;
		for(int i=0;i<relation.length;i++) {
			int in=0;
			for(int j=0;j<local.size();j++) {
				in+=local.get(j);
				if(j==local.size()-1) {
					
				}else in=in*10;
			}
		}
		
		return 0;
	}
}
