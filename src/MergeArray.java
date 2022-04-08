import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First Array Size :");
		int a = sc.nextInt();
		int[] arr1 = new int[a];
		System.out.println("Enter First Array Element :");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.print("Second Array Size :");
		int b = sc.nextInt();
		int[] arr2 = new int[b];
		System.out.println("Enter Second Array Element :");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		sc.close();
		int[] arr3 = new int[arr1.length + arr2.length];
		int[] final_array = mergeArray(arr1,arr2,arr3);
		for (int i : final_array) {
			System.out.println(i);
		}
	}

	private static int[] mergeArray(int[] arr1, int[] arr2, int[] arr3)
	{
		for (int i = 0; i < arr1.length; i++) 
		{
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) 
		{
			arr3[arr1.length +i] = arr2[i]; 
		}
		return arr3;
	}
}
