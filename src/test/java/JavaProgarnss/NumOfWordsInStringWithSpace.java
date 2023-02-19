package JavaProgarnss;

public class NumOfWordsInStringWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdef hv klkhjg";
		//char [] ch=str.toCharArray();
		int count=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			 char rev = str.charAt(i);
			if(rev==' ')
			{
				count=count-1;
			}
			count=count+1;
		}
		System.out.println(count);

	}

}
