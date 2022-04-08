// Java program to print all the permutations 
// of the given string 
public class PermutationOfString {
	public static void main(String[] args) {
		String s = "abc";
		printPermutationString(s,"");
	}
	// Function to print all the permutations of str 
	private static void printPermutationString(String str, String ans) 
	{
		// If string is empty 
		if(str.length() == 0)
		{
			System.out.println(ans +" ");
			return;
		}
		
		for (int i = 0; i < str.length(); i++)
		{
			// ith character of str 
			char ch = str.charAt(i);
			// Rest of the string after excluding  
            // the ith character
			String ros = str.substring(0,i) + str.substring(i+1);
			// Recursive call
			printPermutationString(ros, ans+ch);
		}
	}
}
