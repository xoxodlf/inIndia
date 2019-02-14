/**
 * @Summary   : 
 * @Package : J20180313
 * @FileName : dateEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13.  
 * 
 */
package J20180313;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * @Package : J20180313
 * @FileName : dateEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13. 
 * 
 */
public class dateEx {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=0;
		int month=0;
		int year=0;
		try {
			day=sc.nextInt();
			month=sc.nextInt();
			year=sc.nextInt();
		}catch(Exception e) {
			System.out.println(e);
		}
			
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(day>31||day<1) {
				System.out.println("INVALID DATE");
				return;
			}else {
				System.out.println("VALID DATE");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(day>30||day<1) {
				System.out.println("INVALID DATE");
				return;
			}else {
				System.out.println("VALID DATE");
			}
			break;
		case 2:
			if(year%4==0) {
				if(day>29||day<1) {
					System.out.println("INVALID DATE");
					return;
				}else {
					System.out.println("VALID DATE");
				}
			}else {
				if(day>28||day<1) {
					System.out.println("INVALID DATE");
					return;
				}else {
					System.out.println("VALID DATE");
				}
			}
		}
		Calendar c =Calendar.getInstance();
		Calendar b =Calendar.getInstance();
		c.set(year,month,day);
		b.set(year,1,1);
		long diff=c.getTimeInMillis()-b.getTimeInMillis();
		
		System.out.println(diff/(24*60*60*1000)+1);
	
	}

}
