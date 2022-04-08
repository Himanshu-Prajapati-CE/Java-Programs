import java.util.TreeSet;

public class FindUniqueElment {
	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 5, 6, 3, 6};
		int result = checkANdReturn(arr);
		System.out.println(result);
	}
	
	static int checkANdReturn(int[] arr) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] != arr[j])
				{
					ts.add(arr[i]);
					System.out.println(arr[i]);
					return arr[i];
				}
			}
		}
		return 0;
	}
}
