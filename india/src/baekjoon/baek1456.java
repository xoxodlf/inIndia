package baekjoon;

import java.util.Scanner;
import java.util.Vector;
/**
 * 
 * 백준 알고리즘 거의소수 찾기 문제
 * @Package : baekjoon
 * @FileName : baek1456.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 27. 
 *
 */
class primeNumFind {
	long max;
	long min;
	boolean[] IsNotPrime;
	int[] primeNum;
	//Vector<Integer> a = new Vector<Integer>();

	primeNumFind(long min, long max) {
		this.max = max;
		this.min = min;
	}

	void find() {
		int cntPrime=0;
		primeNum=new int[10000001];
		IsNotPrime = new boolean[10000001];
		for (int i = 2; i <10000001; i++) {

			if (IsNotPrime[i]) {
				i++;
				continue;
			} else {
				primeNum[cntPrime++]=i;
				//a.add(i);
				for (int j = 2; j <= 10000000; j++) {
					if (i * j >= 10000000)
						break;
					IsNotPrime[i * j] = true;
				}
				if (i != 2)
					i++;
			}

		}
		//System.out.println(cntPrime);
		int cnt = 0;
		long TMax = 1000000000000000L;
		for (int k : primeNum) {
			if(k==0)break;
			long n = k;
			while (k <= max / n) {
				if (k * n >= min)
					cnt++;
				n = n * k;
			}
		}
		System.out.println(cnt);
	}

}

public class baek1456 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long m = sc.nextLong();
		long n = sc.nextLong();
		primeNumFind a = new primeNumFind(m, n);
		a.find();
	}

}
