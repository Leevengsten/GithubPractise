package JavaProgarnss;

import java.sql.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.remove(2);
		int cc = ll.size();
		
		int a[]= {11,12,13,14};
		
		
		
		for(Object obj:ll)
		{
			System.out.println(obj);
		}
		for(int j=0;j<ll.size();j++)
		{
			System.out.println(ll.get(j));
		}
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(cc);
		
		for(int b:a)
		{
			System.out.println(b);
		}
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
