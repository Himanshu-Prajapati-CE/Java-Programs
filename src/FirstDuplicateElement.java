import java.util.Scanner;

public class FirstDuplicateElement {
	public static void main(String[] args) {
		System.out.print("Enter Array Size :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter "+n+" Element :");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		sc.close();
		findFirstDuplicateElement(a);
	}

	private static void findFirstDuplicateElement(int[] a) 
	{
		int flag = 0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j] && i!=j)
				{
					flag ++;
					System.out.print(a[i]+" ");
					break;
				}
			}
			if(flag!=0)
			{
				break;
			}
		}
	}
}
