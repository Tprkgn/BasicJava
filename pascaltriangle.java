import java.util.*;
public class pascaltriangle {
	public static long fac(int sayi) {
		long facc�kt�=1;
		while(sayi>0) {
			facc�kt� *= sayi;
			sayi--;
		}
		return facc�kt�;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Sat�r Say�s� Girin: ");
		int s�ra = in.nextInt();
		ucgen(s�ra);
	}
	public static void ucgen(int s�ra) {
	int a=0;
	while(a<s�ra) {
		int b=0,  c= s�ra;
		while(c>a) {
			System.out.print(" ");
			c--;
			}
		while(b<=a) {
			long sat�rc�kt� = (fac(a)/((fac(a-b))*fac(b)));
			System.out.print(" " + sat�rc�kt�);
			b++;
			}
		System.out.println();
		a++;
		}
	}
}