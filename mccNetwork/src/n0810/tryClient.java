package n0810;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;

public class tryClient {

	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		Scanner sc = new Scanner(System.in);
		// Socket s = new Socket("192.168.2.9", 1260);
		Socket s = new Socket(addr, 1252);
		Scanner sc1 = new Scanner(s.getInputStream());
		PrintStream p = new PrintStream(s.getOutputStream());
		ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
		ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
		
		while(true) {
			
			System.out.println("Choose the function");
			System.out.println("1. Sort 5 values");
			System.out.println("2. Find the prime values");
			System.out.println("3. Find the GCD and LCM");
			System.out.println("4. Binary to Decimal,Decimal to Binary, Binary to Octet, Octet to Binary");
			System.out.println("5. Fibonacci");
			System.out.println("6. Hi + \"\"");
			System.out.println("7. Remove all charcters except alphabets");
			System.out.println("8. Find the frequency of chracters");
			System.out.println("9. Find length of the String");
			System.out.println("10 Encoding, Decoding");
			System.out.println("If you type other number program end");
			String a= sc.nextLine();
			if(a.equals("1")) {
				p.println(a);
				int arr[]=new int[5];
				System.out.println("Please enter 5 numbers");
				for(int i=0;i<5;i++) {
					try {
						arr[i]=Integer.parseInt(sc.nextLine());
					}catch (Exception e) {
						System.out.println("Please type number");
						i--;
					}
				}
				oos.writeObject(arr);
				arr = (int[]) ois.readObject();
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
			}else if(a.equals("2")) {
				p.println(a);
				System.out.println("Please enter a number");
				int q = Integer.parseInt(sc.nextLine());
				p.println(q);
				if(sc1.nextBoolean()) {
					System.out.println(q+ " is prime number");
				}else {
					System.out.println(q+ " is Not prime number");
				}
			}else if(a.equals("3")) {
				p.println(a);
				System.out.println("Please enter two numbers");
				int q1 = Integer.parseInt(sc.nextLine());
				int q2 = Integer.parseInt(sc.nextLine());
				p.println(q1);
				p.println(q2);
				System.out.println("GCD is "+sc1.nextInt());
				System.out.println("LCM is "+sc1.nextInt());
			}else if(a.equals("4")) {
				p.println(a);
				System.out.println("Please enter a number");
				int q = Integer.parseInt(sc.nextLine());
				p.println(q);
				System.out.println("Binary is "+sc1.nextLine());
				System.out.println("Octet is "+sc1.nextLine());
				System.out.println("Binary to Decimal "+sc1.nextLine());
				System.out.println("Octet to Decimal "+sc1.nextLine());
			}else if(a.equals("5")) {
				p.println(a);
				System.out.println("Please enter a number");
				int q = Integer.parseInt(sc.nextLine());
				p.println(q);
				System.out.println("Fibonacci is "+sc1.nextInt());
			}else if(a.equals("6")) {
				p.println(a);
				System.out.println("Please enter your name");
				String q=sc.nextLine();
				p.println(q);
				System.out.println(sc1.nextLine());
			}else if(a.equals("7")) {
				p.println(a);
				System.out.println("Please enter some string");
				String q=sc.nextLine();
				p.println(q);
				System.out.println(sc1.nextLine());
			}else if(a.equals("8")) {
				p.println(a);
				System.out.println("Please enter some string");
				String q=sc.nextLine();
				p.println(q);
				int size = sc1.nextInt();
				sc1.nextLine();
				for(int i=0;i<size;i++) {
					System.out.println(sc1.nextLine()+" : "+sc1.nextLine());
				}
				
			}else if(a.equals("9")) {
				p.println(a);
				System.out.println("Please enter some string");
				String q=sc.nextLine();
				p.println(q);
				int size = sc1.nextInt();
				System.out.println("Length of String : "+ size);
				
			}else if(a.equals("10")) {
				p.println(a);
				System.out.println("Please enter some string");
				String q=sc.nextLine();
				String q1=Base64.getEncoder().encodeToString(q.getBytes("utf8"));
				System.out.println("Encoding Sting : "+q1);
				p.println(q1);
				System.out.println("Decoding String : "+ sc1.nextLine());
				p.println("next");
			}else {
				p.println(a);
				ois.close();
				oos.close();
				p.close();
				sc1.close();
				s.close();
				break;
			}
			
		}
	}

}
