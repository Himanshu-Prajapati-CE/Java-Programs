import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n=sc.nextInt();
		sc.close();
		int result = n;
		while(result!=1 && result!=4)
		{
			result = isHappyNumber(result);
		}
		if(result==1)
			System.out.println("Happy Number");
		else
			System.out.println("Not Happy Number");
	}

	private static int isHappyNumber(int n) {
		int sum = 0;
		while(n!=0)
		{
			int r = n%10;
			sum = sum + r*r;
			n = n/10;
		}
		return sum;
	}
}
