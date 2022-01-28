package AssistedPractice;
import java.util.*;
import java.util.regex.*;

public class EmailValidation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emails =new ArrayList<String>();
		emails.add("SimpliLearn@domain.co.in");
		emails.add("SimpliLearn@domain.com");
		emails.add("SimpliLearn.name@domain.com");
		emails.add("SimpliLearn#@domain.co.in");
		//invalid emails list
		emails.add("gmail.com");
		emails.add("SimpliLearn#domain.com");
		
		String regex="^(.+)@(.+)$";
		  
		
		Pattern pattern=Pattern.compile(regex);
		
		for(String email:emails) {
			Matcher matcher=pattern.matcher(email);
			System.out.println(email +" : " + matcher.matches());
			
		}
		
	}

}
