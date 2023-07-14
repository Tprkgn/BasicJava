import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner in  = new Scanner( System.in);
        int n;
        System.out.println("Kaç adet sayı irmek istersiniz? ");
        n = in.nextInt();
        int list[] = new int[n];
        for ( int i = 0 ; i< n ; i++){
            list[i] = in.nextInt();
        }

        bubble_sort(list,n);
        for( int i = 0 ; i<list.length;i++){
            System.out.print(list[i]+", ");
        }
    }

    private static void bubble_sort(int[] list, int n) {
        for( int i = 0 ; i < n-1 ; i++){
            for ( int j=0 ; j < n-i-1 ; j++){
                if(list[j]>list[j+1]){
                    int gecici = list[j];
                    list[j] = list[j+1];
                    list[j+1] = gecici;

                }
            }
        }
    }
}
