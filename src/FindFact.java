import java.util.Scanner;

public class FindFact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n = sc.nextInt();
		sc.close();
		int fact = factOfNumber(n);
		System.out.println(fact);
	}

	private static int factOfNumber(int n) {
		int fact = 1;
		while(n!=0)
		{
			fact = fact * n;
			n--;
		}
		return fact;
	}
}
