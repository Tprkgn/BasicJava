import java.util.*;

public class tahminbotu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int baþ = 512, range = 1024, tutulan = (int) ((Math.random()) * (range + 1)), guess = -1, botguess = baþ, i = 8,
				tur = 0;
		System.err.println("Rastgele 0 ve 1024 aralýðýnda sayý tutuldu. ");
		// --------------------------------------------------------------------
		while (guess != tutulan || botguess != tutulan) {
			System.out.println("Bir sayý tutun: ");
			guess = in.nextInt();
			if (guess > tutulan) {
				System.out.println("Tutulan sayýnýn üzerindesiniz!");
			} else if (guess < tutulan) {
				System.out.println("Tutulan sayýnýn altýndasýnýz!");
			} else if (guess == tutulan) {
				System.err.println("Doðru Cevap!!");
				System.out.println("Tutulan sayý " + tutulan + " dýr." + "\ntur sayýsý: " + tur);
				break;
			}
			// --------------------------------------------------------------------
			if (botguess > tutulan) {
				botguess = (int) (botguess - (Math.pow(2, i)));
				System.out.println("Bot sayý tuttu.");
				if (botguess == tutulan) {
					System.err.println("Bot Kazandý!!\nTutulan sayý: " + tutulan + "\ntur sayýsý: " + tur);
					break;
				}
				i--;
			} else if (botguess < tutulan) {
				botguess = (int) (botguess + (Math.pow(2, i)));
				System.out.println("Bot sayý tuttu.");
				if (botguess == tutulan) {
					System.err.println("Bot Kazandý!!\nTutulan sayý: " + tutulan + "\ntur sayýsý: " + tur);
					break;
				}
				i--;
			}
			tur++;
		}
	}

}
