import java.util.*;
public class carrent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Asgari Fiyat� girin: ");
		int minfiyat = in.nextInt();
		System.out.println("Azami Fiyat� girin: ");
		int maxfiyat = in.nextInt();
		System.out.println("Ara� Say�n�z� Girin: ");
		int kiralananarac = in.nextInt();
		int degismeoran� =(int) kiralananarac/(maxfiyat-minfiyat);
		System.out.println("Her bir birim para i�in de�i�en kiralama say�n�z: " + degismeoran�);
		int maxkazanc1 , maxkazanc2;
		
		do{
			maxkazanc1 = minfiyat*kiralananarac;
			kiralananarac-=degismeoran�;
			minfiyat++;
			maxkazanc2 = minfiyat*kiralananarac;
		}while(minfiyat<=maxfiyat&&kiralananarac>=0&&maxkazanc2>=maxkazanc1);
		minfiyat--;
		kiralananarac+=degismeoran�;
		System.out.println("Maksimum kazan� ve ne az araba say�s�na g�re;\nKiralama tutar�: " + minfiyat + "\nkiralanacak ara� says�: " + kiralananarac + "\nToplam ve en y�ksek kazanc�n�z: " + maxkazanc1);
	}
}
