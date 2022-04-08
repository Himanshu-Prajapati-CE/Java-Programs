import java.util.Scanner;

public class CountsWordsFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Sentance :");
		String str = sc.nextLine();
		sc.close();
		int count = countSentance(str);
		System.out.println("There are "+count+" words present in Sentence");
	}
	
	public static int countSentance(String str)
	{
		int count = 0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' '&& ch[i-1]==' ')
			{
				count ++;
			}
		}
		return count;
	}
}
