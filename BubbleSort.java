import java.util.*;
public class BubbleSort {

    public static void main(String[] args){
        int[] lst = {64,25,12,22,11};
        bubbleSort(lst);
    }

    public static void bubbleSort(int[] lst){
        int n = lst.length;
        for(int j = 0; j < n-1; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (lst[i] > lst[i + 1]) {
                    int temp = lst[i + 1];
                    lst[i + 1] = lst[i];
                    lst[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(lst));
    }

}
