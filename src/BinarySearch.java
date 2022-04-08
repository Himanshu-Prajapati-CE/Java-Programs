import java.util.Scanner;

public class BinarySearch {
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
		System.out.println("Enter Element thet you want to serch :");
		int element = sc.nextInt();
		sc.close();
		searchElement(a, element);
	}

	private static void searchElement(int[] a, int element)
	{
		int li = a[0], hi = a[a.length-1];
		int mi = (li+hi)/2;
		
		while(li<=hi)
		{
			if(a[mi]==element)
			{
				System.out.println(mi);
				break;
			}
			else if(a[mi]<element)
			{
				li = mi + 1;
			}
			else
			{
				hi = mi - 1;
			}
			mi = (li+hi)/2;
		}
	}
}
