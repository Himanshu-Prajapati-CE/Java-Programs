import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterClass {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/text.txt");
		String s = "Himanshu Prajapati";
		char ch[] = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{
			fos.write(ch[i]);
		}
		fos.close();
		
		System.out.println("File Writen...");
	}
}
