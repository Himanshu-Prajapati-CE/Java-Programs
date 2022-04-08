import java.util.Scanner;

public class QuickSort {
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
		sortArray(a,0,a.length-1);
		for (int i : a) 
		{
			System.out.print(i+" ");
		}
	}

	private static void sortArray(int[] a, int low, int high)
	{
		int i = low, j = high;
		int middle = low + (high-low)/2;
		int pivot = a[middle];
		
		while(i<=j)
		{
			while(a[i] < pivot)
			{
				i++;
			}
			while(a[j] > pivot)
			{
				j--;
			}
			if(i<=j)
			{
				swap(a,i,j);
				i++;
				j--;
			}
		}
		if(low<j)
		{
			sortArray(a, low, j);
		}
		if(high > i)
		{
			sortArray(a, i, high);
		}
	}

	private static void swap(int[] a, int i, int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
