import java.util.*;
public class oldSelectionSort {

    public static void main(String args[]) {
        int[] lst = {4, 9, 7, 1, 3, 6, 5};
        selectionSort(lst);
    }

    public static void selectionSort(int[] lst) {
        int n = lst.length;
        for(int i = 0; i < lst.length; i++) {
            int [] currentSlice = getCurrentSlice(lst, i, n);
            //int[] currentSlice = Arrays.copyOfRange(lst, i, n);
            int min = getMinValue(currentSlice);
            if (lst[i] != min) {
                int temp = lst[i];
                int prevIndex = indexOf(lst, min);
                lst[i] = min;
                lst[prevIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(lst));
    }

    public static int[] getCurrentSlice(int[] lst, int i, int n){
        int c = 0;
        int[] currentSlice = new int[n-i];
        for(int j = i; j < n; j++){
            currentSlice[c] = lst[j];
            c++;
        }
        return currentSlice;
    }


    public static int indexOf(int[] lst, int x) {
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int getMinValue(int[] lst) {
        int n = lst.length;
        int minValue = lst[0];
        for (int i = 0; i < n; i++) {
            if (lst[i] < minValue) {
                minValue = lst[i];
            }
        }
        return minValue;
    }

}
