import java.util.*;
public class taskag�tmakas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean iswin =false;
		String []list= {"ta�", "ka��t", "makas"};
		int plwin=0, btwin=0;
		int calguess = 0;
		int ta� = 0, ka��t= 1,makas=2;
		System.out.println("Ta� ka��t makas oyununa ho� geldiniz!");
		System.out.println("3 turu alan galibiyete ula��r!");
		while(!iswin) {
			System.out.println("Tahmin yap�n:");
			String guess = in.nextLine();
			guess=guess.toLowerCase();
			if(guess.equals(list[0]))calguess=0;
			else if(guess.equals(list[1]))calguess=1;
			else if(guess.equals(list[2]))calguess=2;
			int botguess=(int)(Math.random()*3);
			if(botguess==0) {
				System.out.println("Bot ta� yapt�\n");
				if(calguess==0) {
					System.out.println("Berabere!");
				}
				else if(calguess==1) {
					plwin++;
					System.out.println("Kazand�n�z"+"\n puan�n�z: "+plwin+"\n botun puan�: "+btwin);
					if(plwin==3) {
						System.err.println("KAZANDINIZ!!!");
						break;
					}
				}
				else if(calguess==2) {
					btwin++;
					System.out.println("Bot kazand�"+"\n puan�n�z: "+plwin+"\n botun puan�: "+btwin);
					if(btwin==3) {
						System.err.println("BOT KAZANDI!!!");
						break;
					}
				}
			}
			else if(botguess==1) {
				System.out.println("Bot ka��t yapt�\n");
				if(calguess==0) {
					btwin++;
					System.out.println("Bot kazand�"+"\n puan�n�z: "+plwin+"\n botun puan�: "+btwin);
					if(btwin==3) {
						System.err.println("BOT KAZANDI!!!");
						break;
					}
				}
				else if(calguess==1) {
					System.out.println("Berabere!");
				}
				else if(calguess==2) {
					plwin++;
					System.out.println("Kazand�n�z"+"\n puan�n�z: "+plwin+"\n botun puan�: "+btwin);
					if(plwin==3) {
						System.err.println("KAZANDINIZ!!!");
						break;
					}
				}
			}
			else if(botguess==2) {
				System.out.println("Bot makas yapt�\n");
				if(calguess==0) {
					plwin++;
					System.out.println("Kazand�n�z"+"\n puan�n�z: "+plwin+"\n botun puan�: "+btwin);
					if(plwin==3) {
						System.err.println("KAZANDINIZ!!!");
						break;
					}
				}
				else if(calguess==1) {
					btwin++;
					System.out.println("Bot kazand�"+"\n puan�n�z: "+plwin+"\n botun puan�: "+btwin);
					if(btwin==3) {
						System.err.println("BOT KAZANDI!!!");
						break;
					}
				}
				else if(calguess==2) {
					System.out.println("Berabere!");
				}
			}

		}
		
	}

}
