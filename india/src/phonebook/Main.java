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
