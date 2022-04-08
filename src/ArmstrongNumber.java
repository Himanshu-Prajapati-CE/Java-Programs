import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n = sc.nextInt();
		sc.close();
		boolean an = checkNumber(n);
		if(an==true)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

	private static boolean checkNumber(int n) {
		int temp = n, temp1 = n, mul = 1, arm = 0, length = 0;
		
		while(n!=0)
		{
			length ++;
			n = n/10;
		}
		while(temp1!=0)
		{
			int rem = temp1%10;
			for(int i=1; i<=length; i++)
			{
				mul = mul * rem;
			}
			arm = arm + mul;
			temp1 = temp1/10;
			System.out.println(temp1);
		}
		if(temp == arm)
			return true;
		else
			return false;
	}
}
