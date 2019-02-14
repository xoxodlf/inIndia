package n0810;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class encodingEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String base64 = Base64.getEncoder().encodeToString("사랑해".getBytes("utf8"));
		System.out.println("result:"+base64);
		
		System.out.println(new String(Base64.getDecoder().decode(base64)));
	}

}
