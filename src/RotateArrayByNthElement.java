import java.util.Scanner;

public class RotateArrayByNthElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size :");
		int n = sc.nextInt();
		System.out.println("Enter Nth Element from where you want to rotate an aaray :");
        int d = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i=d; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<d; i++)
        {
            System.out.print(a[i]+" ");
        }
	}
}
