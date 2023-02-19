package JavaProgarnss;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sf=new StringBuffer(1);
		sf.append("jhkjhjk");
		sf.reverse();
		sf.replace(2, 4, "zzz");
		sf.insert(1, "villiers");
		System.out.println(sf);
		sf.charAt(3);
		sf.delete(0, 1);
		System.out.println(sf);
		System.out.println(sf.substring(2));
		
		

	}

}
