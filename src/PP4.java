import java.util.Scanner;

public class PP4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n=sc.nextInt();
		sc.close();
		
		PP4 p = new PP4();
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
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
}
