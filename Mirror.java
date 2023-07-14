import java.util.*;
public class Mirror{
	static int [] list = new int [10000];
	static int arr = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = in.nextDouble();
		double isnegative = num;
		if(num<=0)isnegative=num*-1;
		int count =(int)Math.sqrt(isnegative);
		Mirror(num,count);
	}
	public static void Mirror(double num,int count) {
		if((int)num!=0) {
			list[arr]=(int)num;
			System.out.print(list[arr]+", ");
			arr++;
			Mirror(num/2,count);
		}
		else if(count>1){
			count--;
			System.out.print((int)list[count-1]+", ");
			Mirror(0,count);
		}
	}
}