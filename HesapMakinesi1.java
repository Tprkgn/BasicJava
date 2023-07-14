import java.util.*;

public class HesapMakinesi1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Ýlk Sayýyý Girin: ");
		int a = in.nextInt();
		System.out.println("iþlem Seçin:" + "\n\n1= Toplama" + "\n2= Çýkarma" + "\n3= çarpma" + "\n4= Bölme");
		int c = in.nextInt();
		System.out.println("Ýkinci Sayýyý Girin: ");
		int b = in.nextInt();
		if (c == 1) {
			System.out.println(a + " ile " + b + " toplamý: " + (a + b));
		} else if (c == 2) {
			System.out.println(a + " ile " + b + " farký: " + (a - b));
		} else if (c == 3) {
			System.out.println(a + " ile " + b + " çarpýmý: " + (a * b));
		} else if (c == 4) {
			System.out.println(a + " ile " + b + " bölümü: " + (a / b));
		}
	}

}
