package JavaProgarnss;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="agh jk ui jk";
        String str1=str.replaceAll("\\s", "");
        System.out.println(str1);
        String str2=str1.replaceAll("j","z");
        System.out.println(str2);
        
		

	}

}
