import java.util.Arrays;

public class SelectionSort{
    
    public static void main(String[] args){
        int[] lst = {64,25,12,22,11};
        sort(lst);
    }

    public static void sort(int[] lst){
        int n = lst.length;

        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(lst[j] < lst[minIndex]){
                    minIndex = j;
                }
            }
            int temp = lst[i];
            lst[i] = lst[minIndex];
            lst[minIndex] = temp;
        }
    System.out.println(Arrays.toString(lst));
    }
} 