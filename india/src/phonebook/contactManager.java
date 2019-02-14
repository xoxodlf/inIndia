/**
 * @Summary   : 
 * @Package : phonebook
 * @FileName : contactManager.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 20.  
 * 
 */
package phonebook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @Package : phonebook
 * @FileName : contactManager.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 20.
 * 
 */
public class contactManager {
	Scanner sc = new Scanner(System.in);
	ArrayList<contact> contactList = new ArrayList<contact>();
	contactDAOImplement dao=new contactDAOImplement();
	void createContact() {
		System.out.println("name phoneNum birthDay relation shortNum");
		contact tmp = new contact(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
		dao.insertContact(tmp);
	}

	void editContact() {
		System.out.println("바꿀 폰 번호를 입력하시오.");
		String phoneNum=sc.next();
		System.out.println("name phoneNum birthDay relation shortNum");
		contact tmp = new contact(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
		dao.updateContact(phoneNum,tmp);
	}
	
	void findContactNumber() {
		System.out.println("찾을 번호를 입력하시오.");
		String number = sc.next();
		contact tmp= dao.searchContactByNumber(number);
			if (tmp.getPhoneNum()!=null) {
				System.out.println(tmp.getName() + "\t" + tmp.getPhoneNum() + "\t"
						+ tmp.getBirthDay() + "\t" + tmp.getRelation() + "\t"
						+ tmp.getShortNum());
			}else System.out.println("그런번호없어요");
	}
	
	void findContactName() {
		System.out.println("찾을 이름을 입력하시오.");
		String name=sc.next();
		contactList=dao.searchContactByName(name);
		int cnt=0;
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getName().equals(name)) {
				System.out.println(contactList.get(i).getName() + "\t" + contactList.get(i).getPhoneNum() + "\t"
						+ contactList.get(i).getBirthDay() + "\t" + contactList.get(i).getRelation() + "\t"
						+ contactList.get(i).getShortNum());
				cnt++;
			}
		}
		if(cnt==0)System.out.println("그런사람없어");
	}

	void deleteContact() {
		System.out.println("지울 번호 입력해");
		String number=sc.next();
		dao.deleteContact(number);
		
	}

	void viewAllList() {
		contactList=dao.listAll();
		for (int i = 0; i < contactList.size(); i++) {
			System.out.println(contactList.get(i).getName() + "\t" + contactList.get(i).getPhoneNum() + "\t"
					+ contactList.get(i).getBirthDay() + "\t" + contactList.get(i).getRelation() + "\t"
					+ contactList.get(i).getShortNum());
		}
	}
	
	public static void main(String args[]) {
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
