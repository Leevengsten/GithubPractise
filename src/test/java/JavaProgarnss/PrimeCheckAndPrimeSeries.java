package JavaProgarnss;

public class PrimeCheckAndPrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		if(PrimeCheck(a))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		int b=10;
		int c=0;
		String prime="";
		
		for(int j=0;j<100;j++)
		{
		int	counter=0;
			for(int k=j;k>0;k--)
			{
				if()
			}
			
		}

	}
	public static boolean PrimeCheck(int a)
	{
		for(int i=2;i<Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
