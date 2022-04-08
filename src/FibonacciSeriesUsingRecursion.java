import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
	static int a = 0, b=1;
	public static void main(String[] args) {
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.print("0 1 ");
		printSeries(n);
	}

	private static void printSeries(int n) {
		
		if(n!=0)
		{
			int c = a+b;
			System.out.print(c+ " ");
			a=b;
			b=c;
			c=a;
			printSeries(n-1);
		}
		
	}
}
