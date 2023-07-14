import java.util.*;
public class carrent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Asgari Fiyatý girin: ");
		int minfiyat = in.nextInt();
		System.out.println("Azami Fiyatý girin: ");
		int maxfiyat = in.nextInt();
		System.out.println("Araç Sayýnýzý Girin: ");
		int kiralananarac = in.nextInt();
		int degismeoraný =(int) kiralananarac/(maxfiyat-minfiyat);
		System.out.println("Her bir birim para için deðiþen kiralama sayýnýz: " + degismeoraný);
		int maxkazanc1 , maxkazanc2;
		
		do{
			maxkazanc1 = minfiyat*kiralananarac;
			kiralananarac-=degismeoraný;
			minfiyat++;
			maxkazanc2 = minfiyat*kiralananarac;
		}while(minfiyat<=maxfiyat&&kiralananarac>=0&&maxkazanc2>=maxkazanc1);
		minfiyat--;
		kiralananarac+=degismeoraný;
		System.out.println("Maksimum kazanç ve ne az araba sayýsýna göre;\nKiralama tutarý: " + minfiyat + "\nkiralanacak araç saysý: " + kiralananarac + "\nToplam ve en yüksek kazancýnýz: " + maxkazanc1);
	}
}
