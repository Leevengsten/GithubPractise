package JavaProgarnss;

public class ReverseStringAndNum {

	public static void main(String[] args) {
		int a=45;
		int b=0;
		String str="hai the an a";
		String rev="";
		for(int i=0;i<a;i=i)
		{
		 b=(b*10)+a%10;
		a=a/10;
		

	}
		System.out.println(b);
		int len=str.length();
		for(int j=len-1;j>=0;j--)
		{
			rev=rev+str.charAt(j);
		}
		System.out.println(rev);

}
}