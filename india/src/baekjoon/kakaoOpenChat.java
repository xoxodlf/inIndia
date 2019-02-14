/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : kakaoOpenChat.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 10.  
 * 
 */
package baekjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @Package : baekjoon
 * @FileName : kakaoOpenChat.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 10. 
 * 
 */
class User{
	String uid;
	String name;
	public User(String uid, String name) {
		this.uid = uid;
		this.name = name;
	}
	void change(String name){
		this.name=name;
	}
	String enter() {
		return name+"님이 들어왔습니다.";
	}
	String leave() {
		return name+"님이 나갔습니다.";
	}
}
class Command{
	String uid;
	String command;
	public Command(String uid, String command) {
		this.uid = uid;
		this.command = command;
	}
}
class Solution4 {
    public String[] solution(String[] record) {
        String[] answer = {};
        boolean[] flag = new boolean[record.length];
        Map<String, User> userMap = new HashMap<String, User>();
        ArrayList<Command> commandLi = new ArrayList<Command>();
        for(int i=0;i<record.length;i++) {
        	String[] tmp = record[i].split(" ");
        	if(tmp[0].equals("Enter")) {
        		if(!userMap.containsKey(tmp[1])) {
        			User tmpu = new User(tmp[1],tmp[2]);
        			userMap.put(tmp[1],tmpu);
        		}else {
        			userMap.get(tmp[1]).change(tmp[2]);
        		}
        	}
        	if(!tmp[0].equals("Change")) {
        		commandLi.add(new Command(tmp[1], tmp[0]));
        	}else {
        		userMap.get(tmp[1]).change(tmp[2]);
        	}
        	
        }
        
        answer= new String[commandLi.size()];
        for(int i=0;i<commandLi.size();i++) {
        	if(commandLi.get(i).command.equals("Enter")) answer[i]=userMap.get(commandLi.get(i).uid).enter();
        	else answer[i]=userMap.get(commandLi.get(i).uid).leave();
        }
        
        return answer;
    }
    
}

public class kakaoOpenChat {
	public static void main(String[] args) {
		String[] a = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		Solution4 s = new Solution4();
		String[] b = s.solution(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
