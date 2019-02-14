package J20180201;

import java.text.SimpleDateFormat;
import java.util.Date;
public class dateEx {

	public static void main(String[] args) throws Exception {
		String sDate1="31/12/1998";
		
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		Date a = new Date();
		System.out.println(a);
		System.out.println(sDate1+ "\t"+date1);
	}

}
