import java.util.Scanner;

public class SumOfArray {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Array Size :");
	     int n = sc.nextInt();
	     int[] a = new int [n];
	     for(int i=0; i<a.length; i++){
	         a[i] = sc.nextInt();
	     }
	     sc.close();
	     sum(a);
	 }
	 
	 static void sum(int[] a)
	 {
	    int sum=0;
	    for(int i=0; i<a.length; i++){
	        sum += a[i];
	     }
	     System.out.println(sum);
	 }
}
