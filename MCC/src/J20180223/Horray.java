/**
 * @Summary   : 
 * @Package : J20180223
 * @FileName : Horray.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 23.  
 * 
 */
package J20180223;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @Package : J20180223
 * @FileName : Horray.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 23.
 * 
 */
public class Horray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("first num");
		final int n = sc.nextInt();
		boolean isContinue = false;
		System.out.println("second num");
		final int m = sc.nextInt();
		String a[] = new String[n];
		String b[] = new String[m];
		String c[] = new String[n + m];
		System.out.println("A's string");
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
			for (int j = 0; j < i; j++) {
				if (c[j].equals(a[i])) {
					System.out.println("no duplicate");
					i--;
					isContinue = true;
					break;
				}
			}
			if (isContinue) {
				isContinue = false;
				continue;
			}
			c[i] = a[i];
		}
		isContinue = false;
		System.out.println("B's string");
		for (int i = 0; i < m; i++) {
			b[i] = sc.next();
			for (int j = 0; j < n + i; j++) {
				if (c[j].equals(b[i])) {
					System.out.println("no duplicate");
					i--;
					isContinue = true;
					break;
				}
			}
			if (isContinue) {
				isContinue = false;
				continue;
			}
			c[n + i] = b[i];
		}
		Arrays.sort(c);
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("\nMerged Sort Array");
		for (int i = 0; i < n + m; i++) {
			System.out.println(c[i]);
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		for (int i = 0; i < m; i++) {
			System.out.println(b[i]);
		}
	}

}
