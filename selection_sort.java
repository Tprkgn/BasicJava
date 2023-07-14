import java.util.Scanner;

import javax.print.event.PrintEvent;

public class selection_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kaç Sayı irmek İstersinz? ");
        int n = in.nextInt();
        int list[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Sayı: ");
            list[i]=in.nextInt();
        }
        selectionSort(list,n);
        for(int i=0; i < list.length ; i++){
            System.out.print(list[i]+", ");
        }
    }

    private static void selectionSort(int[] list, int n) {
        for(int i = 0 ; i <n-1 ; i++){
            int min = i;
            for(int j = i ; j < n ; j++){
                if(list[i]>list[j]){
                    min = j;
                }
                int temp = list[min];
                list[min] = list[i];
                list[i] =   temp;
            }
        }

    }
}
