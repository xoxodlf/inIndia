package baekjoon;
import java.util.ArrayList;

class math {
    int a[] = {1,2,3,4,5};
	int b[] = {2,1,2,3,2,4,2,5};
	int c[] = {3,3,1,1,2,2,4,4,5,5};
    public int[] solution(int[] answers) {
        int cnt[] = new int[3];
        int max=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==a[i%a.length]) cnt[0]++;
            if(answers[i]==b[i%b.length]) cnt[1]++;
            if(answers[i]==c[i%c.length]) cnt[2]++;
            
            if(i==answers.length-1){
                max=cnt[0]>cnt[1]?(cnt[0]>cnt[2]?cnt[0]:cnt[2]):(cnt[1]>cnt[2]?cnt[1]:cnt[2]);
            }
        }
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            if(max==cnt[i])
                li.add(i+1);
        }
        int[] ans=new int[li.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=li.get(i);
        }
        
        return ans;
    }
}