package J20180201;

import java.io.*;

public class BufferReaderEx {

	public static void main(String[] args) throws Exception {
		InputStreamReader r =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("welcome "+ name);
	}

}
