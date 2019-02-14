/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : failrate.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 10.  
 * 
 */
package baekjoon;

/**
 * 
 * @Package : baekjoon
 * @FileName : failrate.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 10. 
 * 
 */
public class failrate {
	public static void main(String[] args) {
		int []a = {4,4,4,4,4}; 
		Solutionf s = new Solutionf();
		int b[]=s.solution(4, a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}

class Solutionf {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] answer1 = new int[N+1];
        int[] cal = new int[N+1];
        int[] cal1 = new int[N+1];
        double[] rate = new double[N+1];
        for(int i=1;i<answer1.length;i++) {
        	answer1[i]=i;
        }
        for(int i=0;i<stages.length;i++) {
        	if(stages[i]!=N+1)cal1[stages[i]]++;
        	for(int j=1;j<stages[i];j++) {
        		if(j==N+1)break;
        		cal[j]++;
        	}
        }
        for(int i=1;i<cal.length;i++) {
        	rate[i]=(1.0*cal1[i])/(cal[i]+cal1[i]);
        }
        for(int i=1;i<cal.length;i++) {
        	System.out.println(i+" "+cal[i]+" "+cal1[i]+" "+rate[i]);
        }
        for(int i=1;i<rate.length-1;i++) {
        	for(int j=i+1;j<rate.length;j++) {
        		if(rate[i]<rate[j]) {
        			double tmp = rate[i];
        			rate[i]=rate[j];
        			rate[j]=tmp;
        			int tmpI = answer1[i];
        			answer1[i]=answer1[j];
        			answer1[j]=tmpI;
        		}else if(rate[i]==rate[j]){
        			if(answer1[i]>answer1[j]) {
        				int tmpI = answer1[i];
            			answer1[i]=answer1[j];
            			answer1[j]=tmpI;
        			}
        		}
        	}
        }
        
        for(int i=1;i<cal.length;i++) {
        	answer[i-1]=answer1[i];
        }
        
        return answer;
    }
}
