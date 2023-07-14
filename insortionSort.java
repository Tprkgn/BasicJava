import java.util.Scanner;

public class insortionSort {
    public static void main(String[] args) {
        Scanner in  = new Scanner( System.in);
        int n;
        System.out.println("Kaç adet sayı irmek istersiniz? ");
        n = in.nextInt();
        int list[] = new int[n];
        for ( int i = 0 ; i< n ; i++){
            list[i] = in.nextInt();
        }

        insortion_sort(list,n);
        for( int i = 0 ; i<list.length;i++){
            System.out.print(list[i]+", ");
        }
    }

    private static void insortion_sort(int[] list, int n) {
        for(int i = 1 ; i < n ; i++){
            for( int j = i ; j>0 ; j--){
                if(list[j]<list[j-1]){
                    int temp = list[j];
                    list[j]= list[j-1];
                    list[j-1]=temp;
                }

            }
        }
    }
}
