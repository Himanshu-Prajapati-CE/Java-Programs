import java.util.Scanner;

public class FIndMaxAndMinFromArray {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter test case :");
	     int t = sc.nextInt();
	     int max = 0, min = 0;
	     long startTime = 0, endTime = 0;
	     while(t-- >0)
	     {
	    	 System.out.println("Enter Array Size :");
	         int n = sc.nextInt();
	         System.out.println("Enter Array Element :");
	         int []a = new int[n];
	         for(int i=0; i<a.length; i++){
	             a[i] = sc.nextInt();
	         }
	         startTime = System.currentTimeMillis();
	         for(int i=0; i<a.length; i++)
	         {
	             for(int j=i+1; j<a.length; j++)
	             {
	                 if(a[i]<a[j])
	                 {
	                     int temp = a[i];
	                     a[i] = a[j];
	                     a[j] = temp;
	                 }
	             }
	         }
	         endTime = System.currentTimeMillis();
	         for (int i = 0; i < a.length; i++) {
	        	 max = a[0];
	 	     	min = a[a.length-1];
			}
	     }
	     long timeDif = startTime - endTime;
	     System.out.println("Time taken by System :"+timeDif);
	     System.out.println("Max :"+max);
	     System.out.println("Min :"+min);
	 }
}