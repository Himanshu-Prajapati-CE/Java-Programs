import java.util.Scanner;

// Count and return how many times specified char present in string

public class CountSpecifiedCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter String :");
		String str = sc.nextLine();
		
		System.out.println("Please Enter Char :");
		char ch = sc.next().charAt(0);
		sc.close();
		int count = chountCheck(str, ch);
		System.out.println(count);
	}

	private static int chountCheck(String str, char ch)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			if(ch == c)
				count ++;
		}
		return count;
	}
}
