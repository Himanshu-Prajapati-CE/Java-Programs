
public class Student {
	int rollNo;
	String name, address;
	
	//Constructor
	public Student(int rollNo, String name, String address)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	//Used to print student details in Main() function
	public String toString()
	{
		return this.rollNo+" "+this.name+" "+this.address;
	}
}
