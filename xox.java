import java.util.*;

public class xox {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sayi, ilkharf = 0, sonharf;
		String osayi = "";
		System.out.println("Sayý Girin: ");
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
			String baþyazdýr = osayi.substring(0, ilkharf) + "X" + osayi.substring(ilkharf + 1, sonharf) + "X" + osayi.substring(sonharf, sayi - 1);
			System.out.println(baþyazdýr);
			
			sonharf--;
			ilkharf++;
		}
		while (sonharf == ilkharf) {
			String ortayazdýr = osayi.substring(0, sonharf) + "X" + osayi.substring(ilkharf + 1);
			System.out.println(ortayazdýr);
			sonharf--;
			ilkharf++;
		}
		while (sonharf >= 0 && sonharf < ilkharf) {
			String sonyazdýr = osayi.substring(0, sonharf) + "X" + osayi.substring(sonharf, ilkharf - 1) + "X" + osayi.substring(ilkharf, sayi - 1);
			System.out.println(sonyazdýr);
			sonharf--;
			ilkharf++;
		}

	}

}