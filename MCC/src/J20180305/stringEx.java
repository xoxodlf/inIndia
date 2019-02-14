/**
 * @Summary   : 
 * @Package : J20180305
 * @FileName : stringEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 5.  
 * 
 */
package J20180305;

/**
 * 
 * @Package : J20180305
 * @FileName : stringEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 5. 
 * 
 */
public class stringEx {

	public static void main(String[] args) {
		String s1= "java java java point";
		System.out.println(s1.equalsIgnoreCase("t"));
		String s2=String.format("%.2f", 32.22222222);
		String s3=String.format("%1.2f", 32.22222222);
		System.out.println(s2);
		System.out.println(s3);
		char[]ch =new char[15];
		try {
			//s1.getChars(5, 15, ch, 0);
			//System.out.println(ch);
			s1.getChars(3, 10, ch, 0);
			System.out.println(ch);
			System.out.println(s1.indexOf("java"));
			
			System.out.println(s1.lastIndexOf("java",10));
			System.out.println(s1.isEmpty());
			s1="";
			String s5=" ";
			System.out.println(s1.isEmpty());
			if(s5.equals(null))System.out.println("tt");
			String joinstring=String.join("-", "welcome","to","java");
			System.out.println(joinstring);
			s1="dfa sdf sd fsdf sdf";
			String []a=s1.split("\\t");
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			System.out.println(s1.substring(7));
			System.out.println(s1.substring(5,10));
			char s1convert[]=s1.toCharArray();
			for(int i=0;i<s1convert.length;i++) {
				System.out.println(s1convert[i]);
			}
			System.out.println(s1.toUpperCase());
			s3="             TERTERT  ERT             ";
			System.out.println(s3.toLowerCase());
			s3.trim();
			System.out.println(s3+" sdfsdfsdfsdf");
			System.out.println(s3.trim()+" sdfsdfsdfsdf");
			boolean sd=true;
			System.out.println(String.valueOf(sd));
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
