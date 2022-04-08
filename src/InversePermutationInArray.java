import java.util.Scanner;

public class InversePermutationInArray {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        int[] tempArr = new int[arraySize];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<arr.length; i++)
        {
            int currentPosition = arr[i];
            tempArr[currentPosition-1] = i+1;
        }
        for(int i : tempArr){
            System.out.print(i+" ");
        }
	}
}
