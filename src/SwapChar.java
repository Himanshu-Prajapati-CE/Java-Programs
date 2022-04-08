
public class SwapChar {
	public static void main(String[] args) {
		String s1 = "fort city";
		char c1[] = s1.toCharArray();
		int f = 0;
		for (int i = 0; i < c1.length; i++) 
		{
			if(i==0 && c1[i]!=' ' || c1[i-1]==' ' && c1[i]!= ' ')
			{
				f=i;
			}
			if(i+1 == c1.length && c1[i]!=' ' || c1[i]!=' '&& c1[i+1]==' ')
			{
				char t = c1[f];
				c1[f] = c1[i];
				c1[i] = t;
			}
		}
		System.out.println(c1);
	}
}
