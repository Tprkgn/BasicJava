import java.util.*;
public class chardeleter {

	public static void main(String[] args) {
		System.out.print(remove());
	}
	public static String remove() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = in.nextLine().toLowerCase();
		System.out.println("Enter char to delete: ");
		String cha = in.nextLine();
		word = word.replace(cha, "");
		return word;
	}
}