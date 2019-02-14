/**
 * @Summary   : 
 * @Package : phonebook
 * @FileName : Main.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 22.  
 * 
 */
package phonebook;

import java.util.Scanner;

/**
 * 
 * @Package : phonebook
 * @FileName : Main.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 22. 
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		contactManager manager =new contactManager();
		boolean re=true;
		while(re) {
			System.out.println("연락처 관리 시스템");
			System.out.println("1. 연락처 등록하기");
			System.out.println("2. 연락처 삭제하기");
			System.out.println("3. 연락처 수정하기");
			System.out.println("4. 연락처 이름으로 검색하기");
			System.out.println("5. 연락처 번호로 검색하기");
			System.out.println("6. 연락처 전체 목록보기");
			System.out.println("종료하려면 다른 숫자를 눌러주세요.");
			int x=sc.nextInt();
			switch(x) {
			case 1:
				manager.createContact();
				break;
			case 2:
				manager.deleteContact();
				break;
			case 3:
				manager.editContact();
				break;
			case 4:
				manager.findContactName();
				break;
			case 5:
				manager.findContactNumber();
				break;
			case 6:
				manager.viewAllList();
				break;
			default:
				re=false;
			}
		}

	}

}
