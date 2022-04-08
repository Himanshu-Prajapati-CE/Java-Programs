import java.util.Comparator;

public class SortByName implements Comparator<Student>
{
	// Used for sorting in ascending order of 
	// Sort by RollNo

	@Override
	public int compare(Student a, Student b) 
	{
		return a.name.compareTo(b.name);
	}
}
