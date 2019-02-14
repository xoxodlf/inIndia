import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> a = new ArrayList<String>();
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(5); // 5 »ğÀÔ
		v.add(4); // 4 »ğÀÔ
		v.add(-1); // -1 »ğÀÔ
		v.add(2, 100); // 4¿Í -1 »çÀÌ¿¡ Á¤¼ö 100 »ğÀÔ
		
		Iterator<Integer> it = v.iterator(); 
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		int sum = 0;
		it = v.iterator(); // Iterator °´Ã¼ ¾ò±â
		while(it.hasNext()) {
			int n = it.next();
			sum += n; 
		}
		System.out.println("º¤ÅÍ¿¡ ÀÖ´Â Á¤¼ö ÇÕ : " + sum);

		
//		Scanner sc = new Scanner(System.in);
//		int min=0;
//		for(int i=0;i<3;i++) {
//			System.out.println("ÀÌ¸§ÀÔ·ÂÇÏ»ï!");
//			a.add(sc.next());
//			min=a.get(i).length()>a.get(min).length()?min:i;
//		}
//		System.out.println(a.get(min));
	}

}
