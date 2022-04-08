// In HashSet duplicates are not allowed and Insertion order is not preserved

import java.util.HashSet;

public class FindCommonElementUsingHashSet {
	public static void main(String[] args) {
		int[] arr1 = {4,3,25,64,667,54,45,98};
		int[] arr2 = {5,1,4,6,7,4};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr2.length; i++) 
		{
			for (int j = 0; j < arr2.length; j++) 
			{
				if(arr1[i] == arr2[j])
				{
					hs.add(arr1[i]);
				}
			}
		}
		System.out.println(hs);
	}
}
