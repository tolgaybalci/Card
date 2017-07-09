
import java.util.Random;

public class RandomTest {

		
	public static int randomIntegerRandom(int min, int max){
		Random rgen = new Random();
		int range = Math.abs(max - min)+1;
		int random = min+rgen.nextInt(range);
		
		return random;
	}
}

