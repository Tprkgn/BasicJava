import java.util.*;

public class HesapMakinesi1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("�lk Say�y� Girin: ");
		int a = in.nextInt();
		System.out.println("i�lem Se�in:" + "\n\n1= Toplama" + "\n2= ��karma" + "\n3= �arpma" + "\n4= B�lme");
		int c = in.nextInt();
		System.out.println("�kinci Say�y� Girin: ");
		int b = in.nextInt();
		if (c == 1) {
			System.out.println(a + " ile " + b + " toplam�: " + (a + b));
		} else if (c == 2) {
			System.out.println(a + " ile " + b + " fark�: " + (a - b));
		} else if (c == 3) {
			System.out.println(a + " ile " + b + " �arp�m�: " + (a * b));
		} else if (c == 4) {
			System.out.println(a + " ile " + b + " b�l�m�: " + (a / b));
		}
	}

}
