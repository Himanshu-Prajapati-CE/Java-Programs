import java.util.Scanner;

public class CountPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n = sc.nextInt();
		sc.close();
		int total = primeNumber(n);
		System.out.println("Total Prime Number :"+total);
	}
	private static int primeNumber(int n) {
		int flag = 0;
		int count  = 0;
		for (int i = 2; i <= n; i++) 
		{
			for (int j = 2; j <= i-1; j++) 
			{
				if(i%j==0)
					flag ++;
			}
			if(flag==0)
			{
				System.out.println(i);
				count ++;
			}
			else
			{
				flag = 0;
			}
		}
		return count;
	}
}
