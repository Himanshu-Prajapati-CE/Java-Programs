import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n = sc.nextInt();
		sc.close();
		boolean pn = checkNumber(n);
		if(pn==true)
			System.out.println("The Entered Number is Palindrome Number");
		else
			System.out.println("The Entered Number is Not Palindrome Number");
	}

	private static boolean checkNumber(int n) {
		int temp = n;
		int rev = 0;
		while(n!=0)
		{
			int rem = n%10;
			rev = (rev*10)+rem;
			n = n/10;
		}
		if(temp == rev)
			return true;
		else
			return false;
	}
}
