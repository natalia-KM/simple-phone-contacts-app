package main;

public class Checker {
	
	public static String generalCheck(ContactList a, String name, String phoneNo) {
		String res = Checker.checkPhoneNo(phoneNo);
		
		if(res == "inc") {
			System.out.println("Incorrect phone number");
			return "inc";
		} else {
			if(Checker.containsOnlyLetters(name) && a.isNameUnique(name)) {
				return res;
			} else {
				System.out.println("Incorrect name or already exists.");
				return "inc";
			}
			
		}
		
	}
	
	public static boolean nameAndNumberOkay(String name, String phoneNo) {
		String res = Checker.checkPhoneNo(phoneNo);
		if(res == "inc") {
			return false;
		} else {
			if(Checker.containsOnlyLetters(name)) {
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	public static String checkPhoneNo(String phoneNo) {
		String checkedPN;
		
		try {
		if(phoneNo.charAt(0) == '0') {
			checkedPN = phoneNo.substring(1);
			if(checkedPN.length() == 9 || checkedPN.length() == 10) {
				checkedPN = "+44" + checkedPN;
			} else {
				checkedPN = "inc";
			}
		} else if(phoneNo.substring(0, 3).equals("+44")) {
			checkedPN = phoneNo.substring(3);
			if(checkedPN.length() == 9 || checkedPN.length() == 10) {
				checkedPN = phoneNo;
			} else {
				checkedPN = "inc";
			}
		} else {
			if(phoneNo.length() == 10 || phoneNo.length()==9) {
				checkedPN = "+44" + phoneNo;
			} else {
				checkedPN = "inc";
			}
		} 
		return checkedPN;
		} catch(Exception e) {
			return checkedPN = "inc";
		}
		
		
		
		
	}
	
	public static boolean isNameCorrect(String name) {
		
		if(name.length()<12 && name.length()>2) {
			return containsOnlyLetters(name);
		} else {
			return false;
		}

	}
	
	static boolean containsOnlyLetters(String str) {
		int j=0;
		String[] sepStr = str.split("");
		for(int i=0; i<sepStr.length;i++) {
			if(sepStr[i].matches("[a-zA-Z]+")) {
				j+=1;
			}
		}
		if(j==sepStr.length) {
			return true;
		} 
		return false;
	}

}
