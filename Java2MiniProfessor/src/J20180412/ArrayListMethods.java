/**
 * @Summary   : 
 * @Package : J20180412
 * @FileName : ArrayListMethods.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 16.  
 * 
 */
package J20180412;

import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 
 * @Package : J20180412
 * @FileName : ArrayListMethods.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 16. 
 * 
 */
public class ArrayListMethods<T> {
	
	public boolean compareList(ArrayList<T> al1, ArrayList<T> al2) {
		if(al1.size()!=al2.size())return false;
		else {
			for(int i=0;i<al1.size();i++) {
				if(!al1.get(i).equals(al2.get(i)))return false;
			}
		}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public T[] toArray(ArrayList<T> al,Class c){
		T[] result;
		result= (T[])Array.newInstance(c, al.size());
		for(int i=0;i<al.size();i++) {
			result[i]=al.get(i);
		}
		
		return  result;
	}
	
	public static void writeFileData(ArrayList al) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\xoxod\\Desktop\\csvfile.csv");//경로수정
			for(int i=0;i<al.size();i++) {
				fw.append(String.valueOf(al.get(i))+",");
			}
			fw.flush();
			fw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void swap(ArrayList<T> al,int index1,int index2) {
		T temp;
		temp=al.get(index1);
		al.set(index1, al.get(index2));
		al.set(index2, temp);
	}
	
	public void reverse(ArrayList<T> al) {
		ArrayList<T> temp=new ArrayList<T>();
		for(int i=al.size()-1;i>=0;i--) {
			temp.add(al.get(i));
		}
		al.clear();
		for(int i=0;i<temp.size();i++) {
			al.add(temp.get(i));
		}
	}
	
	public void shuffle(ArrayList<T> al) {
		int cnt=0;
		boolean[] check=new boolean[al.size()];
		ArrayList<T> temp=new ArrayList<T>();
		while(cnt<al.size()) {
			int rand=(int) (al.size()*Math.random());
			if(check[rand]) continue;
			else {
				temp.add(al.get(rand));
				check[rand]=true;
				cnt++;
			}
		}
		al.clear();
		for(int i=0;i<temp.size();i++) {
			al.add(temp.get(i));
		}
	}
	public static void sort(ArrayList<Integer> al) {
		int size=al.size();
		int[] ar = new int[size];
		for(int i=0;i<size;i++) {
			ar[i]=al.get(i);
		}
		for(int i=1;i<size;i++) {
			int temp=ar[i];
			for(int j=i-1;j>=0;j--) {
				if(ar[j]>temp) {
					ar[j+1]=ar[j];
					ar[j]=temp;
				}else {
					ar[j+1]=temp;
					break;
				}
			}
		}
		al.clear();
		for(int i=0;i<size;i++) {
			al.add(ar[i]);
		}
	}
	public static void main(String[] args) {
		ArrayListMethods<String> a =new ArrayListMethods<String>();
		ArrayList<String> al=new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("5");
		al.add("6");
		al.add("7");
		System.out.println("/////////////////////////// origin");
		for(String s : al) {
			System.out.println(s);
		}
		a.swap(al, 0, 1);
		System.out.println("/////////////////////////// swap");
		for(String s : al) {
			System.out.println(s);
		}
		a.reverse(al);
		System.out.println("/////////////////////////// reverse");
		for(String s : al) {
			System.out.println(s);
		}
		a.shuffle(al);
		System.out.println("/////////////////////////// shuffle");
		for(String s : al) {
			System.out.println(s);
		}
		String[] sta=a.toArray(al,String.class);
		
		for(int i=0;i<sta.length;i++) {
			System.out.println(sta[i]+" array");
		}
		writeFileData(al);
		ArrayList<String> al3=new ArrayList<String>();
		al3.add("3");
		al3.add("5");
		al3.add("3");
		al3.add("5");
		al3.add("3");
		al3.add("5");
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(3);
		al2.add(1);
		al2.add(4);
		al2.add(2);
		al2.add(5);
		al2.add(7);
		sort(al2);
		for(int i=0;i<al2.size();i++) {
			System.out.println(al2.get(i) +" sort");
		}
		System.out.println(a.compareList(al, al3));
		

	}

}
