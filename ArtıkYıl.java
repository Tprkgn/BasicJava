 import  java.util.*;

public class Art�kY�l {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Y�l girin: ");
		int y = in.nextInt();
		boolean a = y % 4 == 0;
		boolean b = y % 100 == 0;
		boolean c = y % 400 == 0;

		if (a && !b || c) {
			System.out.println(y + " y�l� art�k y�ld�r.");
		} else {
			System.out.println(y + " y�l� art�k y�l de�ildir.");
		}

	}

}
