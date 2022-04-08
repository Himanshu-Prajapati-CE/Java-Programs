import java.util.Scanner;

public class CountHowManyTimesSubStringPresentInMainString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 1st Sentance :");
		String str1 = sc.nextLine();
		System.out.println("Please Enter 2nd Sentance :");
		String str2 = sc.nextLine();
		sc.close();
		int rs = checkString(str1,str2);
		System.out.println(rs);
	}

	private static int checkString(String str1, String str2)
	{
		char a[] = str1.toCharArray();
		char b[] = str2.toCharArray();
		int count = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			int j=0; 
			int k=i;
			while(k<a.length && j<b.length && a[k]==b[j])
			{
				k++;
				j++;
			}
			if(j==b.length)
			{
				count ++;
				i = k-1;
			}
		}
		return count;
	}
}
