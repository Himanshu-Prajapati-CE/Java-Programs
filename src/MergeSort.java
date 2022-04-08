
public class MergeSort {
	int[] array, temp_merge_arr;
	int length;
	public static void main(String[] args) 
	{
		int[] input_arr = {9,8,7,6,5,32,5,4,33,3};
		
		MergeSort ms = new MergeSort();
		ms.sort(input_arr);
		for (int i : input_arr) 
		{
			System.out.print(i+" ");
		}
	}
	private void sort(int[] input_arr) 
	{
		this.array = input_arr;
		this.length= input_arr.length;
		this.temp_merge_arr = new int[length];
		divideArray(0,length-1);
	}
	private void divideArray(int lower_index, int higher_index) 
	{
		if(lower_index < higher_index)
		{
			int middle_index= lower_index + (higher_index-lower_index)/2;
			divideArray(lower_index, middle_index);
			divideArray(middle_index + 1, higher_index);
			mergeArray(lower_index, middle_index, higher_index);
		}
	}
	private void mergeArray(int lower_index, int middle_index, int higher_index) 
	{
		for (int i = lower_index; i < higher_index; i++) 
		{
			temp_merge_arr[i] = array[i];
		}
		int i = lower_index;
		int j = middle_index + 1;
		int k = lower_index;
		while (i<=middle_index && j<=higher_index) 
		{
			if(temp_merge_arr[i] <= temp_merge_arr[j])
			{
				array[k] = temp_merge_arr[i];
				k++;
				i++;
			}
		}
		while (i<=middle_index)
		{
			array[k] = temp_merge_arr[i];
			k++;
			i++;
		}
	}
	
}
