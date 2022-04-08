import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n = sc.nextInt();
		sc.close();
		int rev = reverseNumber(n);
		System.out.println("Reverse Number is :"+rev);
	}
	static int reverseNumber(int n)
	{
		int rev = 0;
		while(n!=0)
		{
			int r = n%10;
			rev = (rev*10) + r;
			n = n/10;
		}
		return rev;
	}
}
