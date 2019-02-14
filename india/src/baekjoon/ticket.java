/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : ticket.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 9.  
 * 
 */
package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @Package : baekjoon
 * @FileName : ticket.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 9.
 * 
 */
class ticket {
	String name;
	int step;
	public ticket(String name,int step) {
		this.name = name;
		this.step = step;
	}
	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN","ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		
		String[] s = (new Solution2()).solution(tickets);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}

class Solution2 {
	String[][] tickets;
	String[] answer;
	public String[] solution(String[][] tickets) {
		this.tickets=tickets;
		answer = new String[tickets.length+1];
		
		route("ICN",new boolean[tickets.length],0);
		
		return answer;
	}
	
	public void route(String now, boolean[] pass,int depth) {
		System.out.println(depth+" "+now);
		if(answer[answer.length-1]!=null||depth==answer.length-1) {
			answer[depth]=now;
			return;
		}
		answer[depth]=now;
		boolean[] local= new boolean[pass.length];
		ArrayList<String> li = new ArrayList<String>();
		ArrayList<Integer> liN = new ArrayList<Integer>();
		for(int i=0;i<local.length;i++) {
			local[i]=pass[i];
		}
		for(int i=0;i<tickets.length;i++) {
			if(tickets[i][0].equals(now)&&!local[i]) {
				li.add(tickets[i][1]);
				liN.add(i);
			}
		}
		
		for(int i=0;i<li.size()-1;i++) {
			for(int j=i+1;j<li.size();j++) {
				if(li.get(j).compareTo(li.get(i))<0) {
					String tmpS = li.get(j);
					li.set(j, li.get(i));
					li.set(i, tmpS);
					int tmp = liN.get(j);
					liN.set(j, liN.get(i));
					liN.set(i, tmp);
				}
			}
		}
		
		for(int i=0;i<li.size();i++) {
			local[liN.get(i)]=true;
			route(li.get(i),local,depth+1);
			local[liN.get(i)]=false;
			if(answer[answer.length-1]!=null)break;
		}
		
	}
}
