import java.util.Scanner;

public class PP5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n=sc.nextInt();
		sc.close();
		
		PP5 p = new PP5();
		p.patternProgramming(n);
	}

	private void patternProgramming(int n) 
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int k = n; k >= i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	
