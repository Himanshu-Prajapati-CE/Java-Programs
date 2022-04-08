import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n = sc.nextInt();
		sc.close();
		boolean pnum = isPrimeNumber(n);
		if(pnum==true)
			System.out.println("The Entered Number is Prime Number");
		else
			System.out.println("The Entered Number is Not Prime Number");
	}
	static boolean isPrimeNumber(int n) {
		int flag = 0;
		for (int i = 2; i <= n/2; i++) {
			if(n%i==0)
				flag ++;
		}
		if(flag==0)
			return true;
		else
			return false;
	}
	
}
