import java.util.Scanner;

public class FindCommonElementFromTwoArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Array Size :");
		int n = sc.nextInt();
		int[] array1 = new int[n];
		System.out.print("Enter "+n+" Element :");
		for (int i = 0; i < n; i++) 
		{
			array1[i] = sc.nextInt();
		}
		
		System.out.print("Enter 2nd Array Size :");
		int m = sc.nextInt();
		int[] array2 = new int[m];
		System.out.print("Enter "+n+" Element :");
		for (int i = 0; i < n; i++) 
		{
			array2[i] = sc.nextInt();
		}
		sc.close();
		commonElement(array1, array2);
	}
	
	private static void commonElement(int[] array1, int[] array2)
	{
		for (int i = 0; i < array1.length; i++) 
		{
			for (int j = 0; j < array2.length; j++) 
			{
				if(array1[i] == array2[j])
				{
					System.out.println(array1[i]);
				}
			}
		}
	}
}