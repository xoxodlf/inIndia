/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : network.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 8.  
 * 
 */
package baekjoon;

import java.util.ArrayList;

/**
 * 
 * @Package : baekjoon
 * @FileName : network.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 8. 
 * 
 */
public class network {

}

class Solution {
    int[][] computers;
    boolean flag[];
    public int solution(int n, int[][] computers) {
        this.computers=computers;
        flag = new boolean[n];
        int answer = 0;

        for(int i=0;i<n;i++) {
            if(flag[i])continue;
            flag[i]=true;
            count(i, new ArrayList<Integer>());
            answer++;
        }

        return answer;
    }

    public void count(int i, ArrayList<Integer> list) {
        for(int j=0;j<computers.length;j++) {
            if(!flag[j]&&computers[i][j]==1&&!list.contains(j)) {
                flag[j]=true;
                list.add(j);
                count(j, list);
            }
        }
    }

}