import java.util.Scanner;

public class DecimalToHexa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Decimal Number :");
		int n = sc.nextInt();
		sc.close();
		String hx = decToHexa(n);
		System.out.println("HexaDecimal Number is :"+hx);
		
	}
	private static String decToHexa(int n) {
		String hx = "";
		while(n!=0)
		{
			int rem = n%16;
			if(rem<10)
				hx = rem + hx;
			else
				hx = (char)(rem+55) + hx;
			n = n/16;
		}
		return hx;
	}
}
