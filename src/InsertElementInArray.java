import java.util.Scanner;

public class InsertElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size :");
		int n = sc.nextInt();
		
		int[] a = new int[n+1];
		System.out.println("Please Enter Element In the Array :");
		for (int i = 0; i < a.length -1; i++) 
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Index Value :");
		int index = sc.nextInt();
		System.out.println("Enter Element :");
		int element = sc.nextInt();
		sc.close();
		int[] array = insertElement(a,index,element);
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	private static int[] insertElement(int[] a, int index, int element)
	{
		for (int i = a.length -1; i > index; i--)
		{
			a[i] = a[i-1];
		}
		a[index - 1] = element;
		return a;
	}
}
