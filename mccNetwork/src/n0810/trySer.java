package n0810;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
public class trySer {

	public static int fibonacci(int n) {
		
		if(n==1) return 1;
		if(n==2) return 1;
		
		return fibonacci(n-2)+fibonacci(n-1);
	}
	
	public static void main(String[] args) throws Exception {
		ServerSocket s1 = new ServerSocket(1252);
		Socket ss = s1.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		PrintStream p = new PrintStream(ss.getOutputStream());
		ObjectOutputStream oos = new ObjectOutputStream(ss.getOutputStream());
		ObjectInputStream ois = new ObjectInputStream(ss.getInputStream());
		while(true) {
			
			String s = sc.nextLine();
			if(s.equals("1")) {
				System.out.println("in 1");
				int arr[]=(int[]) ois.readObject();
				Arrays.sort(arr);
				oos.writeObject(arr);
			}else if(s.equals("2")) {
				System.out.println("in 2");
				int q = Integer.parseInt(sc.nextLine());
				Boolean an= true;
				for(int i=2;i<Math.sqrt(q);i++) {
					if(q%i==0) {
						an=false;
						break;
					}
				}
				System.out.println(an);
				p.println(an);
			}else if(s.equals("3")) {
				System.out.println("in 3");
				int q1=Integer.parseInt(sc.nextLine());
				int q2=Integer.parseInt(sc.nextLine());
				int min=q1>q2?q2:q1;
				int max=q1>q2?q1:q2;
				for(int i=min;i>0;i--) {
					if(q1%i==0&&q2%i==0) {
						min=i;
						break;
					}
				}p.println(min);
				
				for(int i=max;i<=q1*q2;i++) {
					if(i%q1==0&&i%q2==0) {
						max=i;
						break;
					}
				}p.println(max);
			}else if(s.equals("4")) {
				System.out.println("in 4");
				int q=Integer.parseInt(sc.nextLine());
				p.println(Integer.toBinaryString(q));
				p.println(Integer.toOctalString(q));
				p.println(Integer.parseInt(Integer.toBinaryString(q),2));
				p.println(Integer.parseInt(Integer.toOctalString(q),8));
			}else if(s.equals("5")) {
				System.out.println("in 5");
				int q=Integer.parseInt(sc.nextLine());
				p.println(fibonacci(q));
			}else if(s.equals("6")) {
				System.out.println("in 6");
				String q=sc.nextLine();
				p.println("Hi "+q);
			}else if(s.equals("7")) {
				System.out.println("in 7");
				String q=sc.nextLine();
				char[] arr= q.toCharArray();
				String a ="";
				for(int i =0;i<arr.length;i++) {
					if((arr[i]>64&&arr[i]<91)||(arr[i]>96&&arr[i]<123)) {
						a=a+arr[i];
					}
				}
				p.println(a);
			}else if(s.equals("8")) {
				System.out.println("in 8");
				String q=sc.nextLine();
				char a[]=q.toCharArray();
				ArrayList<Character> words=new ArrayList<Character>();
				ArrayList<Integer> fre=new ArrayList<Integer>();
				boolean check=false;
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<words.size();j++) {
						if(words.get(j).equals(a[i])) {
							fre.set(j, fre.get(j)+1);
							check=true;
							break;
						}
					}
					if(!check) {
						words.add(a[i]);
						fre.add(1);
					}
					check=false;
				}
				p.println(words.size());
				for(int i=0;i<words.size();i++) {
					p.println(words.get(i));
					p.println(fre.get(i));
				}
			}else if(s.equals("9")) {
				System.out.println("in 9");
				String q=sc.nextLine();
				p.println(q.length());
			}else if(s.equals("10")) {
				System.out.println("in 10");
				String q=sc.nextLine();
				p.println(new String(Base64.getDecoder().decode(q)));
			}else {
				oos.close();
				ois.close();
				p.close();
				sc.close();
				ss.close();
				s1.close();
				break;
			}
			
		}
	}
}
