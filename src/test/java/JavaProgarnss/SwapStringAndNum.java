package JavaProgarnss;

public class SwapStringAndNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hjghj";
		String str2="tyui";
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.print(str1+" "+str2);

	}

}
