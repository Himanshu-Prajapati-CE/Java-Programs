import java.util.Scanner;

public class PP3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n=sc.nextInt();
		sc.close();
		
		PP3 p = new PP3();
		p.patternProgramming(n);
	}

	private void patternProgramming(int n) {
		for (int i = 1; i <= n; i++)
		{
			for (int j = n-1; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
