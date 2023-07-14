 import  java.util.*;

public class ArtýkYýl {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Yýl girin: ");
		int y = in.nextInt();
		boolean a = y % 4 == 0;
		boolean b = y % 100 == 0;
		boolean c = y % 400 == 0;

		if (a && !b || c) {
			System.out.println(y + " yýlý artýk yýldýr.");
		} else {
			System.out.println(y + " yýlý artýk yýl deðildir.");
		}

	}

}
