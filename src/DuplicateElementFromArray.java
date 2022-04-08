import java.util.Scanner;

public class DuplicateElementFromArray {
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
		findDuplicateElement(a);
	}

	private static void findDuplicateElement(int[] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
