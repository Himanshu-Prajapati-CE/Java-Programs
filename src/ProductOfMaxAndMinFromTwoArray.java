import java.util.Scanner;

public class ProductOfMaxAndMinFromTwoArray {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			 int a = sc.nextInt();
	         int[] arr1 = new int[a];
	         for(int i=0; i<a; i++){
	             arr1[i]=sc.nextInt();
	         }
	         int b = sc.nextInt();
	         int[] arr2 = new int[b];
	         for(int i=0; i<b; i++){
	             arr2[i]=sc.nextInt();
	         }
	         sc.close();
	         int minValue = Integer.MIN_VALUE;
	         int maxValue = Integer.MAX_VALUE;
	         
	         for(int i=0; i<arr1.length; i++){
	             if(maxValue>arr1[i]){
	                 maxValue=arr1[i];
	             }
	         }
	         for(int i=0; i<arr2.length; i++){
	             if(minValue<arr2[i]){
	                 minValue=arr2[i];
	             }
	         }
	         System.out.println(maxValue);
	         System.out.println(minValue);
	         
	       //  System.out.println(minValue * maxValue);
		}
}
