import java.util.Scanner;

public class PerfectSquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		sc.close();
		
		boolean number = checkPerfectSquareNumber(n);
		if(number == true)
			System.out.println(n+" The number is Perfect square root Number...");
		else
			System.out.println(n+" The number is Not a Perfect square root Number...");
	}
	
	public static boolean checkPerfectSquareNumber(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(i*i==n)
			{
				return true;
			}
		}
		return false;
	}
	
//	public static boolean checkPerfectSquareNumber(int n)
//	{
//		for(int i=1; i*i<=n; i++)
//		{
//			if((n%i==0) && (n/i==i))
//			{
//				return true;
//			}
//		}
//		return false;
//	}
}
