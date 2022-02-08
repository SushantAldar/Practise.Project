package Phase1;
import java.util.ArrayList;
import java.util.regex.*;

public class EmailValidation {
	public static void main(String args[]) {
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("susha@gmail.co.in");
		emails.add("satish.com");
		emails.add("satish.ajay@outlook.com");
		emails.add("1234@edu.co.in");
		emails.add("Trainings@");
		emails.add("@yahoo.com");
		
		String format = "^(.+)@(.+)$";
		
		Pattern pattern = Pattern.compile(format);
		
		for(String email : emails) {
			Matcher match = pattern.matcher(email);
			System.out.println(email + ":"+ match.matches()+"\n");
		}
	}

}
