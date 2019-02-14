/**
 * @Summary   : 
 * @Package : superAssignment
 * @FileName : SMTPAuthenticator.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27.  
 * 
 */
package superAssignment;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 
 * @Package : superAssignment
 * @FileName : SMTPAuthenticator.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27. 
 * 
 */
public class SMTPAuthenticator extends Authenticator{
	
	@Override
	public PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("xoxodlf@naver.com", "dhwlddj1");
	}
}
