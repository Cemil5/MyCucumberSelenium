package replit;

public class SMSmessage {

	public static void main(String[] args) {

		String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
	 
		mySecond(message);
	    
	}
	public static void mySecond(String message) {
		String sender;
		String phoneNumber;
		String messageBody;
		
		sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
		phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
		messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));

		
		System.out.println("Sender: "+sender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Message body: "+ messageBody);
		
	}
	
	 public static void myFirst(String message) {
		String sender;
		String phoneNumber;
		String messageBody;
	    String temp ="";

	    int i=0, s1=0, s2=0, n1=0, n2=0, m1=0, m2=0;
	    int l = message.length();
	   for (;i<l;i++) {
		   temp = message.substring(i, i+1);
		   if (temp.equals("<")) {
			   s1 = i+1;
		   } else  if (temp.equals(">")) {
			   s2 = i;
		   } else  if (temp.equals("[")) {
			   n1 = i+1;
		   } else  if (temp.equals("]")) {
			   n2 = i;
		   } else  if (temp.equals("{")) {
			   m1 = i+1;
		   } else  if (temp.equals("}")) {
			   m2 = i;
		   }  
	   }
	   sender = message.substring(s1, s2);
	   phoneNumber = message.substring(n1, n2);
	   messageBody = message.substring(m1, m2);
	   System.out.println("Sender: "+sender);
	   System.out.println("Phone Number: " + phoneNumber);
	   System.out.println("Message body: "+ messageBody);

	}
}
