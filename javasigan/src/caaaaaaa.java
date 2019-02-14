import java.util.Calendar;

public class caaaaaaa {
	
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
	    int mon = cal.get(Calendar.MONTH);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    int hour = cal.get(Calendar.HOUR_OF_DAY);
	    int min = cal.get(Calendar.MINUTE);
	    int sec = cal.get(Calendar.SECOND);

	 if(hour>4&&hour<12) {
		 System.out.println("좋은아침데스~");
	 }if(hour>=12&&hour<18) {
		 System.out.println("안녕하세요~");
	 }
	if(hour>=18&&hour<22) {
		 System.out.println("좋은하루데스?");
	 }
	
	if(hour>=22&&hour<4) {
		 System.out.println("잘자룽");
	 }
	}
	
	
}
