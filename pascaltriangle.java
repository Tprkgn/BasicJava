import java.util.*;
public class pascaltriangle {
	public static long fac(int sayi) {
		long faccýktý=1;
		while(sayi>0) {
			faccýktý *= sayi;
			sayi--;
		}
		return faccýktý;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Satýr Sayýsý Girin: ");
		int sýra = in.nextInt();
		ucgen(sýra);
	}
	public static void ucgen(int sýra) {
	int a=0;
	while(a<sýra) {
		int b=0,  c= sýra;
		while(c>a) {
			System.out.print(" ");
			c--;
			}
		while(b<=a) {
			long satýrcýktý = (fac(a)/((fac(a-b))*fac(b)));
			System.out.print(" " + satýrcýktý);
			b++;
			}
		System.out.println();
		a++;
		}
	}
}