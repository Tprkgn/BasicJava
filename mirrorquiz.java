import java.util.*;
public class mirrorquiz {

	public static void Mirror(int num) {
		
		if (num > 0) {   
			if (num == 1) { 
				System.out.print(num + ", ");  
			} 
			else {
				System.out.print(num + ", "); Mirror(num / 2);  
			}
		}
		
		else if(num < 0) { 
			if(num == -1) {  
				System.out.print(num + ", "); 
			}
			else {
				System.out.print(num + ", "); Mirror(num / 2);  
			}
		}
		else {
			System.out.println(num); 
		}
		
		if(num !=1 && num !=-1 && num !=0) {  
			System.out.print(num+", ");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		Mirror(num);
	}
}


