package replit;
/*
 * This method has 4 String parameters and returns a String
  - `db`: information in database. Each item is separated by a **#**. Each element will also have a number in the beginning about which element it is.
  - `op`: action that will be taken on database (add, edit, or remove)
  - `id`: The id number that will be manipulated
  - `data`: extra data that will be used alongside operation
- The method returns the modifed database
 */

public class LameDatabase {

	public static void main(String[] args) {

	System.out.println(lameDb("1etsy#2wooden#3spoon","add","4","aaa").equals("1etsy#2wooden#3spoon#4aaa")); // test case examples validation
	System.out.println(lameDb("1etsy#2wooden#3spoon","add","1","bbb").equals("1bbb#2etsy#3wooden#4spoon"));
	System.out.println(lameDb("1test#2bla#3foo","edit","2","bbb").equals("1test#2bbb#3foo"));
	System.out.println(lameDb("1tst#2bla#3foo","delete","1","").equals("#2bla#3foo"));
		
	}

	public static String lameDb(String db, String op, String id, String data) {
		
		String result ="";		
		String str1 = db.substring(1,db.indexOf("#2"));
		String str2 = db.substring(db.indexOf("#2")+2,db.indexOf("#3"));
		String str3 = db.substring(db.indexOf("#3")+2);
				
				
		switch (op) {
			case "add":
				switch (id) {
				case "1":
					result = "1" + data + "#2" + str1 +"#3"+ str2 +"#4"+ str3; break;
				case "2":
					result = "1" + str1 + "#2" + data +"#3"+ str2 +"#4"+ str3; break;
				case "3":
					result = "1" + str1 + "#2" + str2 +"#3"+ data +"#4"+ str3; break;
				case "4":
					result = "1" + str1 + "#2" + str2 +"#3"+ str3 +"#4"+ data; break;
				} break;
			case "edit":
				switch (id) {
				case "1":	
					result = "1" + data + "#2" + str2 +"#3"+ str3; break;
				case "2": 
					result = "1" + str1 + "#2" + data +"#3"+ str3; break;
				case "3":
					result = "1" + str1 + "#2" + str2 +"#3"+ data; break;
				} break;
			case "delete":
				switch (id) {
				case "1":	
					result = "#2" + str2 +"#3"+ str3; break;
				case "2":
					result = "1" + str1 +"#3"+ str3; break;
				case "3": 
					result = "1" + str1 + "#2" + str2; break;
				}
			}
	    return result;
	  }//end lameDb
}