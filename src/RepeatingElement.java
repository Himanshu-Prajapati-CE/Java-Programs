import java.util.LinkedHashSet;
import java.util.Scanner;

public class RepeatingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
	     int t = sc.nextInt();
	     while(t-- >0)
	     {
	         int n = sc.nextInt();
	         int a[] = new int[n];
	         for(int i=0; i<a.length; i++){
	             a[i] = sc.nextInt();
	         }
	         for(int i=0; i<a.length; i++)
	         {
	             for(int j=i+1; j<a.length; j++)
	             {
	                 if(a[i] == a[j])
	                 {
	                	 lhs.add(a[i]);
	                 }
	             }
	         }
	         for (int i : lhs) 
	         {
	        	 System.out.println(i);
			 }
	     }
	}
}
