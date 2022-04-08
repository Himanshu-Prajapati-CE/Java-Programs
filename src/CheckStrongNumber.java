import java.util.Scanner;

public class CheckStrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n=sc.nextInt();
		sc.close();
		boolean rs=isStrongNumber(n);
		if(rs==true)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}
	static boolean isStrongNumber(int n)
	{
		int temp = n, sum = 0;
		while(n!=0)
		{
			int rem = n%10;
			int fact = 1;
			while(rem!=0)
			{
				fact = fact * rem;
				rem --;
			}
			sum = sum + fact;
			n = n/10;
		}
		if(sum == temp)
			return true;
		else
			return false;
	}
}
