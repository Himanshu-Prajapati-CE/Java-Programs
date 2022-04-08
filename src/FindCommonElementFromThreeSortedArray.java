import java.util.ArrayList;

public class FindCommonElementFromThreeSortedArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,22};
		int[] b = {2,3,4,5,7,10,22,33};
		int[] c = {22,33};
		
		int x=0, y=0,z=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (x<a.length && y<b.length && z<c.length)
		{
			if(a[x]==b[y] && b[y]==c[z])
			{
				al.add(a[x]);
				x++;
				y++;
				z++;
			}
			else if(a[x]<b[y])
			{
				x++;
			}
			else if(b[y]<c[z])
			{
				y++;
			}
			else
			{
				z++;
			}
		}
		System.out.println(al);
	}
}
