import java.util.Scanner;

public class MaxNumFromArray {
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
		int max = findMaxValue(a);
		System.out.println("Max Number :"+max);
	}

	private static int findMaxValue(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		return max;
	}
}
