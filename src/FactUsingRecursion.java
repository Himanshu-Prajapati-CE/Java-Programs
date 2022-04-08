import java.util.Scanner;

public class FactUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number :");
		int n = sc.nextInt();
		sc.close();
		FactUsingRecursion f = new FactUsingRecursion();
		int fact = f.factOfNumber(n);
		System.out.println(fact);
	}

	public int factOfNumber(int n) 
	{
		int fact = 1;
		if(n==1)
			return n;
		fact = factOfNumber(n-1)*n;
		return fact;
	}
}
