import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> a = new ArrayList<String>();
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(5); // 5 ����
		v.add(4); // 4 ����
		v.add(-1); // -1 ����
		v.add(2, 100); // 4�� -1 ���̿� ���� 100 ����
		
		Iterator<Integer> it = v.iterator(); 
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		int sum = 0;
		it = v.iterator(); // Iterator ��ü ���
		while(it.hasNext()) {
			int n = it.next();
			sum += n; 
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);

		
//		Scanner sc = new Scanner(System.in);
//		int min=0;
//		for(int i=0;i<3;i++) {
//			System.out.println("�̸��Է��ϻ�!");
//			a.add(sc.next());
//			min=a.get(i).length()>a.get(min).length()?min:i;
//		}
//		System.out.println(a.get(min));
	}

}
