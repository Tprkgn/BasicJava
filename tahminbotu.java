import java.util.*;

public class tahminbotu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ba� = 512, range = 1024, tutulan = (int) ((Math.random()) * (range + 1)), guess = -1, botguess = ba�, i = 8,
				tur = 0;
		System.err.println("Rastgele 0 ve 1024 aral���nda say� tutuldu. ");
		// --------------------------------------------------------------------
		while (guess != tutulan || botguess != tutulan) {
			System.out.println("Bir say� tutun: ");
			guess = in.nextInt();
			if (guess > tutulan) {
				System.out.println("Tutulan say�n�n �zerindesiniz!");
			} else if (guess < tutulan) {
				System.out.println("Tutulan say�n�n alt�ndas�n�z!");
			} else if (guess == tutulan) {
				System.err.println("Do�ru Cevap!!");
				System.out.println("Tutulan say� " + tutulan + " d�r." + "\ntur say�s�: " + tur);
				break;
			}
			// --------------------------------------------------------------------
			if (botguess > tutulan) {
				botguess = (int) (botguess - (Math.pow(2, i)));
				System.out.println("Bot say� tuttu.");
				if (botguess == tutulan) {
					System.err.println("Bot Kazand�!!\nTutulan say�: " + tutulan + "\ntur say�s�: " + tur);
					break;
				}
				i--;
			} else if (botguess < tutulan) {
				botguess = (int) (botguess + (Math.pow(2, i)));
				System.out.println("Bot say� tuttu.");
				if (botguess == tutulan) {
					System.err.println("Bot Kazand�!!\nTutulan say�: " + tutulan + "\ntur say�s�: " + tur);
					break;
				}
				i--;
			}
			tur++;
		}
	}

}
