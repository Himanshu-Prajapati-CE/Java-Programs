import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		System.out.print("Please Enter Array Size :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Please Enter "+n+" Element in the Array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int[] array = sortArray(a);
		for(int i : array)
		{
			System.out.print(i+" ");
		}
	}
	
	public static int[] sortArray(int[] a)
	{
		int temp, j;
		for (int i = 1; i < a.length; i++) 
		{
			temp = a[i];
			j = i;
			while(j>0 && a[j-1] > temp)
			{
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
		return a;
	}
}
