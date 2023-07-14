import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");//ask for enet a num
		int num = in.nextInt();//scanner
		System.out.println(fibonacci(num));	//calling method
	}
	public static int fibonacci(int num) {
		if(num==1)return 1;//if num is 1 returns 1
		else if(num==0)return 0;//if num is 0 returns 0
		return helper(0, 1, num);//if num isn't 0 or 1 calling method
	}
	public static int helper(int i, int j, int k) {
		return k==0 ? i:helper(j, i+j, k-1);//recursive for fibonacci or controls 0
	}
}
