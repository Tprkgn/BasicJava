
import java.util.*;

public class kodkoruma {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNextInt()) {
			in.next();
			System.err.println("Tekrar Deneyin");
		}
		int a = in.nextInt();
		System.err.println("baþardýn aq çocu " + a);
	}
}
