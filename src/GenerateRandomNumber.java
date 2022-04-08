import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args) {
		Random rn = new Random();
		int r = rn.nextInt(10);
		System.out.println(r);
	}
}
