import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Array Size :");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.print("Please Enter "+n+" Element :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		int[] array = sortArray(a);
		for (int i : array) 
		{
			System.out.print(i+" ");
		}
	}
	
	public static int[] sortArray(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			int min = i;
			for (int j = i+1; j < a.length; j++) 
			{
				//if(a[j] < a[min])
				if(a[min] > a[j] )
				{
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}
}
