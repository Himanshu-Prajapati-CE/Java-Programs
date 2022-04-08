import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n = sc.nextInt();
		sc.close();
		fibonacci(n);
	}
	private static void fibonacci(int n) {
		int a = 0, b=1, c;
		System.out.print(a+" "+b);
		
		for(int i=0; i<=n; i++)
		{
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
