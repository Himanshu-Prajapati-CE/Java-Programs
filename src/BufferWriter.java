import java.io.*;

public class BufferWriter {
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("D:/text.txt",true);
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write("Computer");
		bf.close();
	}
}
