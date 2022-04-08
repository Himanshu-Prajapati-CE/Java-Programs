
public class AnagramStringCheck 
{
	public static void main(String[] args) 
	{
		String a = "aaabbb";
		String b = "bbbaaa";
		
		boolean isAnagram = true;
		
		int[] al = new int[256];
		
		for (char c : a.toCharArray()) 
		{
			int index = (int) c;
			al[index]++;
		}
		for (char c : b.toCharArray()) 
		{
			int index = (int) c;
			al[index]--;
		}
		for (int i = 0; i < 256; i++) 
		{
			if(al[i] != 0)
			{
				isAnagram = false;
				break;
			}
		}
		if(isAnagram)
			System.out.println("Anagram String");
		else
			System.out.println("Not Anagram String");
	}
}
