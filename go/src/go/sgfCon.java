///**
// * @Summary   : 
// * @Package : go
// * @FileName : sgfCon.java
// * @Author : Yang TaeIl
// * @date : 2018. 10. 12.  
// * 
// */
//package go;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
///**
// * 
// * @Package : go
// * @FileName : sgfCon.java
// * @Author : Yang TaeIl
// * @date : 2018. 10. 12. 
// * 
// */
//public class sgfCon {
//
//	public static void main(String[] args) throws Exception{
//		Scanner sc = new Scanner(System.in);
//		int[] result = new int[19*19+1];
//		int dummy=4;//필요없는 줄 위에거 갯수
//		Map<Character, Integer> matchingMap = new HashMap<Character, Integer>();
//		for(int i=0;i<19;i++) {
//			matchingMap.put((char)(i+97), i);
//		}
//		boolean isWhite=false;//본인이 흑인지 백인지를 나타내는거임. 백이라면 true 흑이라면 false로해야함 필수임
//		
//		File file = new File("C:\\Users\\xoxod\\eclipse-workspace\\go\\src\\go\\흑4.sgf");
//		BufferedReader in = new BufferedReader(new FileReader(file));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\xoxod\\eclipse-workspace\\go\\src\\go\\result.csv"));
//	    String s;
//	    int cnt=0;
//	    char b;
//	    if(isWhite)b='B';
//	    else b='W';
//	    while ((s = in.readLine()) != null) {
//	    	try {
//	    		if(s.length()>2) {
//			    	if(cnt>dummy-1) {
//			    		if(s.charAt(1)!=b) {
//			    			
//			    			result[result.length-1]=matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4));
//				    		for(int i=0;i<result.length;i++) {
//						    	bw.write(result[i]+"");
//						    	if(i+1!=result.length)
//						    		bw.write(",");
//						    }
//				    		bw.newLine();
//				    	}
//			    		if(isWhite)b='B';
//			    	    else b='W';
//			    		if(isWhite) {
//			    			if(s.charAt(2)=='['&&s.charAt(3)==']') {
//			    				cnt++;continue;
//			    			}
//			    			if(s.charAt(1)=='B') {
//				    			System.out.println(s+" 1번");
//				    			result[matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4))]=2;
//				    		}else {
//				    			System.out.println(s+" 2번");
//				    			result[matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4))]=1;
//				    		}
//			    		}else {
//			    			if(s.charAt(2)=='['&&s.charAt(3)==']') {
//			    				cnt++;continue;
//			    			}
//			    			if(s.charAt(1)=='B') {
//				    			result[matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4))]=1;
//				    		}else {
//				    			result[matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4))]=2;
//				    		}
//			    		}
//			    	}
//			    	if(cnt<=dummy-1) {
//			    		cnt++;
//			    	}else if(s.charAt(0)==';'){
//			    		cnt++;
//			    	}
//			    	if(isWhite) {
//			    		if(s.charAt(1)=='B')
//			    			b='B';
//			    	}else {
//			    		if(s.charAt(1)=='W')
//			    			b='W';
//			    	}
//			    	
//		    	}
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//	    	
//	    	
//	    }
//	    in.close();
//	    bw.flush();
//	    bw.close();
//	}
//
//}


/**
 * @Summary   : 
 * @Package : go
 * @FileName : sgfCon.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 12.  
 * 
 */
package go;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @Package : go
 * @FileName : sgfCon.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 12. 
 * 
 */
public class sgfCon {

   public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in);
      int[] result = new int[19*19+1];
      int dummy=4;//필요없는 줄 위에거 갯수
      Map<Character, Integer> matchingMap = new HashMap<Character, Integer>();
      for(int i=0;i<19;i++) {
         matchingMap.put((char)(i+97), i);
      }
      boolean isWhite=true;//본인이 흑인지 백인지를 나타내는거임. 백이라면 true 흑이라면 false로해야함 필수임
      
      File file = new File("C:\\Users\\xoxod\\eclipse-workspace\\go\\src\\go\\trashcan-HiraBot44.sgf");
      BufferedReader in = new BufferedReader(new FileReader(file));
       String s;
       System.out.println("Enter Frame No");//프래임넘버는 몇 번째 장면이 문제인지를 말하는거임.놓아져 있는 돌의 개수 (먹힌게 없다고 가정한다면)와 동일함.
       int frame = sc.nextInt();
       int cnt=0;
       while ((s = in.readLine()) != null) {
          
          if(cnt>dummy-1) {
             if(cnt-dummy==frame) {
                result[19*19]=matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4));
                break;
             }
             if(isWhite) {
                System.out.println(s);
                if(s.charAt(2)=='['&&s.charAt(3)==']') {
                   cnt++;continue;
                   
                }
                if(s.charAt(1)=='B') {
                   result[matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4))]=2;
                }else {
                   result[matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4))]=1;
                }
             }else {
                if(s.charAt(2)=='['&&s.charAt(3)==']') {
                   cnt++;continue;
                }
                if(s.charAt(1)=='B') {
                   result[matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4))]=1;
                }else {
                   result[matchingMap.get(s.charAt(3))*19+matchingMap.get(s.charAt(4))]=2;
                }
             }
          }
          if(cnt<=dummy-1) {
             cnt++;
          }else if(s.charAt(0)==';'){
             cnt++;
          }
       }
       in.close();
       
       BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\xoxod\\eclipse-workspace\\go\\src\\go\\result.csv"));
       for(int i=0;i<result.length;i++) {
          bw.write(result[i]+"");
          if(i+1!=result.length)
             bw.write(",");
       }
       bw.flush();
       bw.close();
   }

}