import java.util.Scanner;

public class FindAppearOnceElementFromArray {
	public static void main(String[] args) {
		System.out.print("Enter Array Size :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" Element :");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		int array = findElement(arr);
		System.out.println(array);
	}

	private static int findElement(int[] arr) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			res = res ^ arr[i];
		}
		return res;
	}
}
