import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Binary Number :");
		int n = sc.nextInt();
		sc.close();
		int dec = binToDec(n);
		System.out.println("Binary To Decimal Conversion is :"+dec);
	}
	
	static int binToDec(int n)
	{
		int i = 0, dec = 0;
		while(n!=0)
		{
			int r = n%10;
			dec = dec + r*pow(2,i);
			n = n/10;
			i++;
		}
		return dec;
	}
	static int pow(int x, int i)
	{
		int pw = 1;
		while(i>0)
		{
			pw = pw*x;
			i --;
		}
		return pw;
	}
}
