import java.util.Scanner;

public class DecToOcatal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Decimal Number :");
		int n = sc.nextInt();
		sc.close();
		String oct = decToOctal(n);
		System.out.println("Ocatal Number :"+oct);
	}
	
	public static String decToOctal(int n) {
		String oct = "";
		while(n!=0)
		{
			int rem = n%8;
			oct = rem + oct;
			n = n/8;
		}
		return oct;
	}
}
