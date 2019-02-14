/**
 * @Summary   : 
 * @Package : J20180313
 * @FileName : loginlogout.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13.  
 * 
 */
package J20180313;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * @Package : J20180313
 * @FileName : loginlogout.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13. 
 * 
 */
class User{
	int id;
	int loginH;
	int loginMin;
	int loginD;
	int loginMon;
	int logoutH;
	int logoutMin;
	@Override
	public String toString() {
		return id + "\t\t\t" + loginH + ":" + loginMin + "\t" + loginD + "-"+ loginMon + "\t\t" + logoutH + ":" + logoutMin + "\t" + logoutD+ "-" + logoutMon + "\t\t" + useHour + ":" + useMin;
	}
	int logoutD;
	int logoutMon;
	int useHour;
	int useMin;
	User(int id,int loginH,int loginMin,int loginD,int loginMon,int logoutH,int logoutMin,int logoutD,int logoutMon){
		this.id=id;
		this.loginH=loginH;
		this.loginMin=loginMin;
		this.loginD=loginD;
		this.loginMon=loginMon;
		this.logoutH=logoutH;
		this.logoutMin=logoutMin;
		this.logoutD=logoutD;
		this.logoutMon=logoutMon;
	}
}
public class loginlogout {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		User[] u=new User[n];
		System.out.println("IDENTIFICATION\t\tLOGIN_TIME&DATE\t\t\tLOGOUT_TIME&DATE");
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			String lntime= sc.next();
			String lndate= sc.next();
			String lotime= sc.next();
			String lodate= sc.next();
			System.out.println();
			u[i]=new User(id,Integer.parseInt(lntime.split(":")[0]),Integer.parseInt(lntime.split(":")[1]),Integer.parseInt(lndate.split("-")[0]),Integer.parseInt(lndate.split("-")[1]),Integer.parseInt(lotime.split(":")[0]),Integer.parseInt(lotime.split(":")[1]),Integer.parseInt(lodate.split("-")[0]),Integer.parseInt(lodate.split("-")[1]));
			Calendar c =Calendar.getInstance();
			Calendar b =Calendar.getInstance();
			c.set(2018,u[i].loginMon,u[i].loginD,u[i].loginH,u[i].loginMin);
			b.set(2018,u[i].logoutMon,u[i].logoutD,u[i].logoutH,u[i].logoutMin);
			long diff=b.getTimeInMillis()-c.getTimeInMillis();
			u[i].useHour=(int) (diff/(60*60*1000));
			u[i].useMin=(int) (diff/(60*1000))-u[i].useHour*60;
		}
		int maxHour=0;
		int maxMin=0;
		int	maxIndex=0;
		System.out.println("IDENTIFICATION\t\tLOGIN_TIME&DATE\t\tLOGOUT_TIME&DATE\tDURATION_HOUR:MINS");
		for(int i=0;i<n;i++) {
			System.out.println(u[i].toString());
			if(u[i].useHour>maxHour) {
				maxHour=u[i].useHour;
				maxMin=u[i].useMin;
				maxIndex=i;
			}else if(maxHour==u[i].useHour) {
				if(u[i].useMin>maxMin) {
					maxMin=u[i].useMin;
					maxIndex=i;
				}
			}
		}
		System.out.println("\nThe user who logged in for the longest duration:-");
		System.out.println(u[maxIndex].toString());
	}

}
