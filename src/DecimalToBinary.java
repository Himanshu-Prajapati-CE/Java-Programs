import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Decimal Number :");
		int n = sc.nextInt();
		sc.close();
		String bin = decToBin(n);
		System.out.println("Decimal To Binary Converted Number is :"+bin);
	}
	static String decToBin(int n) {
		String bin = "";
		while(n!=0)
		{
			int r = n%2;
			bin = r + bin;
			n = n/2;
		}
		return bin;
	}
}
