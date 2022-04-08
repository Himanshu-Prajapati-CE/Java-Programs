import java.util.Scanner;

public class PP2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n=sc.nextInt();
		sc.close();
		
		PP2 p = new PP2();
		p.patternProgramming(n);
	}

	private void patternProgramming(int n) {
		for (int i = 0; i <= n; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 0; i <= n; i++)
		{
			for (int j = n-1; j >= i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
