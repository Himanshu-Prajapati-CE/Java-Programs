
public class RemoveDuplicateElementFromSortedArray {
	public static void main(String[] args) {
		int[] a = {1,1,1,1,2,3,4,4,5,6,7,8,9,9,10};
		int[] temp = new int[a.length];
		
		int j = 0;
		
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i] != a[i+1])
			{
				temp[j] = a[i];
				j++;
			}
		}
		temp[j] = a[a.length-1];
		for (int i : temp) 
		{
			System.out.println(i);
		}
	}
}
