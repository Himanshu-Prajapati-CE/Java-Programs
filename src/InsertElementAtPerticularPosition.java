import java.util.Scanner;

public class InsertElementAtPerticularPosition {
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
		System.out.println("Enter Index Value :");
		int index = sc.nextInt();
		System.out.println("Enter Element :");
		int element = sc.nextInt();
		sc.close();
		int[] array = insertElement(a,index,element);
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}

	private static int[] insertElement(int[] a, int index, int element) 
	{
		if(index<0 || index>a.length)
		{
			System.out.println("Index Out Of Range :");
			return a;
		}
		int[] final_array = new int[a.length + 1];
		final_array[index] = element;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(i<index)
				final_array[i] = a[i];
			else
				final_array[i+1] = a[i];
		}
		return final_array;
	}
}
