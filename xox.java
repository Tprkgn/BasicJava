import java.util.*;

public class xox {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sayi, ilkharf = 0, sonharf;
		String osayi = "";
		System.out.println("Say� Girin: ");
		while (!in.hasNextInt()) {
			in.next();
			System.err.println("Tekrar Deneyin");
		}
		sayi = in.nextInt();
		sonharf = sayi - 1;
		while (osayi.length() < sayi) {
			osayi += "O";
		}
		while (sonharf >= 0 && sonharf > ilkharf) {
			String ba�yazd�r = osayi.substring(0, ilkharf) + "X" + osayi.substring(ilkharf + 1, sonharf) + "X" + osayi.substring(sonharf, sayi - 1);
			System.out.println(ba�yazd�r);
			
			sonharf--;
			ilkharf++;
		}
		while (sonharf == ilkharf) {
			String ortayazd�r = osayi.substring(0, sonharf) + "X" + osayi.substring(ilkharf + 1);
			System.out.println(ortayazd�r);
			sonharf--;
			ilkharf++;
		}
		while (sonharf >= 0 && sonharf < ilkharf) {
			String sonyazd�r = osayi.substring(0, sonharf) + "X" + osayi.substring(sonharf, ilkharf - 1) + "X" + osayi.substring(ilkharf, sayi - 1);
			System.out.println(sonyazd�r);
			sonharf--;
			ilkharf++;
		}

	}

}