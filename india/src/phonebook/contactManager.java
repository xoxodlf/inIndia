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
		System.out.println("�ٲ� �� ��ȣ�� �Է��Ͻÿ�.");
		String phoneNum=sc.next();
		System.out.println("name phoneNum birthDay relation shortNum");
		contact tmp = new contact(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
		dao.updateContact(phoneNum,tmp);
	}
	
	void findContactNumber() {
		System.out.println("ã�� ��ȣ�� �Է��Ͻÿ�.");
		String number = sc.next();
		contact tmp= dao.searchContactByNumber(number);
			if (tmp.getPhoneNum()!=null) {
				System.out.println(tmp.getName() + "\t" + tmp.getPhoneNum() + "\t"
						+ tmp.getBirthDay() + "\t" + tmp.getRelation() + "\t"
						+ tmp.getShortNum());
			}else System.out.println("�׷���ȣ�����");
	}
	
	void findContactName() {
		System.out.println("ã�� �̸��� �Է��Ͻÿ�.");
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
		if(cnt==0)System.out.println("�׷��������");
	}

	void deleteContact() {
		System.out.println("���� ��ȣ �Է���");
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
			System.out.println("����ó ���� �ý���");
			System.out.println("1. ����ó ����ϱ�");
			System.out.println("2. ����ó �����ϱ�");
			System.out.println("3. ����ó �����ϱ�");
			System.out.println("4. ����ó �̸����� �˻��ϱ�");
			System.out.println("5. ����ó ��ȣ�� �˻��ϱ�");
			System.out.println("6. ����ó ��ü ��Ϻ���");
			System.out.println("�����Ϸ��� �ٸ� ���ڸ� �����ּ���.");
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
