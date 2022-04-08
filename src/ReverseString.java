import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter String :");
		String str = sc.nextLine();
		sc.close();
		String rev = reverseString(str);
		System.out.println("Reverse String is :"+rev);
	}
	
	static String reverseString(String str)
	{
		String rev="";
		int length = str.length();
		for(int i=length-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		return rev;
	}
}
