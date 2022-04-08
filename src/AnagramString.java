import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 1st Sentance :");
		String str1 = sc.nextLine();
		System.out.println("Please Enter 2nd Sentance :");
		String str2 = sc.nextLine();
		sc.close();
		boolean rs = isAnagram(str1,str2);
		if(rs)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

	private static boolean isAnagram(String str1, String str2) 
	{
		String s1 = str1.replaceAll(" ", "");
		String s2 = str2.replaceAll(" ", "");
		
		str1 = s1.toLowerCase();
		str2 = s2.toLowerCase();
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
}
