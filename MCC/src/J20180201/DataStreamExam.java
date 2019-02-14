package J20180201;
import java.io.*;
import java.util.Formatter;
public class DataStreamExam {

	public static void main(String[] args) throws IOException {
		InputStreamReader r =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		Double f=Double.parseDouble(args[0]);
		Double g=Double.parseDouble(args[1]);
//		System.out.println("Enter P1");
//		Double f =Double.parseDouble(br.readLine());
//		System.out.println("Enter P2");
//		Double g =Double.parseDouble(br.readLine());
		Double area =f*g*3.14;
		Formatter fmf = new Formatter();
		fmf.format("%1.2f", area);
		System.out.println("Area of eclipse "+fmf);
	}

}
