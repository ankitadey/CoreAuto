package utility;

import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;



public class EmailUtil {
	
	static Date now = new Date();
	public static String TimeStamp = now.toString().replace(":", "-");
	
	public static void sendEmail() throws EmailException
	{
		/*Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("deyanki2@gmail.com", "ankitadey6789"));
		email.setSSLOnConnect(true);
		email.setFrom("anki.dey@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("kumar.sumeet@girnarsoft.com");
		email.send();*/
		
		
		 // Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  
		  String filename = System.getProperty("user.dir")+"\\Reports\\"+TimeStamp+constant.Project_Name + "_AutomationReport.html";
		  System.out.println("File Name is :"+filename);
		  attachment.setPath(filename);
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  //attachment.setDescription("Picture of John");
		 // attachment.setName("AutomationReport: " +Helper.getCurrentDateTime()+".html");

		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.googlemail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("defg@gmail.com", "*****"));
		  email.setSSLOnConnect(true);
		  email.setFrom("defg@gmail.com");
		  email.addTo("abcd@gmail.com");
		  email.addTo("deyanki2@gmail.com");
		  email.setSubject("TestMail");
		  email.setMsg("Automation Test has been executed successfully ! Please download and find the attached Report!!");
		  
		  
		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();
	}

}
