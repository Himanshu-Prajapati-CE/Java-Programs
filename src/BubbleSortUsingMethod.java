import java.util.Scanner;

public class BubbleSortUsingMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Array Size :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Please Enter "+n+" Array Value :");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int[] sortedarray = sortAtrray(a);
		for (int i : sortedarray) {
			System.out.println(i);
		}
	}

	private static int[] sortAtrray(int[] a) {
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length -1 -i; j++) 
			{
				if(a[j] < a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
}
