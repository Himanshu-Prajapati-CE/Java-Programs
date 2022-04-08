import java.util.Scanner;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size :");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.println("Please Enter Element In the Array :");
		for (int i = 0; i < a.length ; i++) 
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Element :");
		int del_element = sc.nextInt();
		sc.close();
		int[] array = removeElement(a,del_element);
		for (int i = 0; i < array.length -1; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	private static int[] removeElement(int[] a, int del_element) {
		for (int i = 0; i < a.length; i++) 
		{
			if(del_element == a[i])
			{
				for (int j = i; j < a.length-1; j++) 
				{
					a[j] = a[j+1];
				}
				break;
			}
		}
		return a;
	}
}
