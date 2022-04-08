import java.util.Scanner;

public class PP7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n=sc.nextInt();
		sc.close();
		
		PP7 p = new PP7();
		p.patternProgramming(n);
	}

	private void patternProgramming(int n) {
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (i*2)-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
