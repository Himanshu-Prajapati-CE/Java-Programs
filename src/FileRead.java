import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("D:/text.txt");
		int i;
		do 
		{
			i = fis.read();
			System.out.print((char)i+" ");
		} while (i!= -1);
		fis.close();
	}
}
