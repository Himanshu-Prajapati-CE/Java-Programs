// Sum of N Number Using Recursion
public class RecursionExample {
	public static void main(String[] args) {
		
		int num = 10;
		int sum = callRecursion(num);
		System.out.println(sum);
	}

	private static int callRecursion(int i) 
	{
		if(i==0)
			return i;
		int sum = i + callRecursion(i-1);
		return sum;
	}
}
