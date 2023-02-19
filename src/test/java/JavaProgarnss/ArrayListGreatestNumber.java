package JavaProgarnss;

import java.util.ArrayList;

public class ArrayListGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(5);
		a.add(2);
		a.add(9);
		a.add(8);
		int b=a.get(0);
 
		//System.out.println(a.size());
		for(int i=1;i<a.size();i++)
		{
			if(b<a.get(i))
			{
				b=a.get(i);
			}
			if((a.get(i)%2)==0)
			{
				System.out.println(a.get(i));
			}
			 
		}
		System.out.println(b);

	}

}
