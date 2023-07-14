import java.util.*;
public class taskagýtmakas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean iswin =false;
		String []list= {"taþ", "kaðýt", "makas"};
		int plwin=0, btwin=0;
		int calguess = 0;
		int taþ = 0, kaðýt= 1,makas=2;
		System.out.println("Taþ kaðýt makas oyununa hoþ geldiniz!");
		System.out.println("3 turu alan galibiyete ulaþýr!");
		while(!iswin) {
			System.out.println("Tahmin yapýn:");
			String guess = in.nextLine();
			guess=guess.toLowerCase();
			if(guess.equals(list[0]))calguess=0;
			else if(guess.equals(list[1]))calguess=1;
			else if(guess.equals(list[2]))calguess=2;
			int botguess=(int)(Math.random()*3);
			if(botguess==0) {
				System.out.println("Bot taþ yaptý\n");
				if(calguess==0) {
					System.out.println("Berabere!");
				}
				else if(calguess==1) {
					plwin++;
					System.out.println("Kazandýnýz"+"\n puanýnýz: "+plwin+"\n botun puaný: "+btwin);
					if(plwin==3) {
						System.err.println("KAZANDINIZ!!!");
						break;
					}
				}
				else if(calguess==2) {
					btwin++;
					System.out.println("Bot kazandý"+"\n puanýnýz: "+plwin+"\n botun puaný: "+btwin);
					if(btwin==3) {
						System.err.println("BOT KAZANDI!!!");
						break;
					}
				}
			}
			else if(botguess==1) {
				System.out.println("Bot kaðýt yaptý\n");
				if(calguess==0) {
					btwin++;
					System.out.println("Bot kazandý"+"\n puanýnýz: "+plwin+"\n botun puaný: "+btwin);
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
					System.out.println("Kazandýnýz"+"\n puanýnýz: "+plwin+"\n botun puaný: "+btwin);
					if(plwin==3) {
						System.err.println("KAZANDINIZ!!!");
						break;
					}
				}
			}
			else if(botguess==2) {
				System.out.println("Bot makas yaptý\n");
				if(calguess==0) {
					plwin++;
					System.out.println("Kazandýnýz"+"\n puanýnýz: "+plwin+"\n botun puaný: "+btwin);
					if(plwin==3) {
						System.err.println("KAZANDINIZ!!!");
						break;
					}
				}
				else if(calguess==1) {
					btwin++;
					System.out.println("Bot kazandý"+"\n puanýnýz: "+plwin+"\n botun puaný: "+btwin);
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
