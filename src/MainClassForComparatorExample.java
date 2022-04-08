import java.util.ArrayList;
import java.util.Collections;

public class MainClassForComparatorExample
{
	public static void main(String[] args) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(3, "Himanshu", "Mehsana"));
		al.add(new Student(5, "Tirth", "Baroda"));
		al.add(new Student(4, "Nik", "Mehsana"));
		al.add(new Student(1, "Bacchan", "Mehsana"));
		al.add(new Student(2, "Dig", "Ahmedabad"));
		
		System.err.println("Unsorted Array..........");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		System.err.println("Sort by RollNo...............");
		Collections.sort(al, new SortByRollNo());
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		System.err.println("Sort By Name...............");
		Collections.sort(al, new SortByName());
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		
	}
}
