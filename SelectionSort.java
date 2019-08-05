import java.util.*;

public class SelectionSort {

    public static void main(String args[]) {
        int[] lst = {4, 9, 7, 1, 3, 6, 5};
        selectionSort(lst);
        int indexTest = indexOf(lst, 4);
        //System.out.println(indexTest);
        //System.out.println(lst[0]);
        //selectionSort(lst);
    }

    public static void selectionSort(int[] lst) {
        int n = lst.length;
        int min = getMinValue(lst);
        if(lst[0] != min){
            int temp = lst[0];
            int prevIndex = indexOf(lst, min);
            lst[0] = min;
            lst[prevIndex] = temp;
        }
        System.out.println(Arrays.toString(lst));
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
/*
    public static void selectionSort(int[] lst) {
        // get the length
        int n = lst.length;
        for (int i = 0; i < n; i++) {
            int index = 0;
            int smallest = lst[i];
            for (int j = i; j < n; j++) {
                if (lst[j] < smallest) {
                    smallest = lst[j];
                    index = j;
                }
                int temp = lst[i];
                lst[i] = smallest;
                lst[index] = temp;
            }
        }
        System.out.println(Arrays.toString(lst));
    }

*/