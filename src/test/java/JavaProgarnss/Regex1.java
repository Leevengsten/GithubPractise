package JavaProgarnss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("^[a-z]{1}[\\s][a-z,A-Z]{1}$");
		Matcher m=p.matcher("a l");
		if(m.matches())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		

	}

}
