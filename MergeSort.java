import java.util.*;
public class MergeSort {
    // Driver method
    public static void main(String args[]) {
        int[] lst = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        System.out.println(Arrays.toString(lst));

        sort(lst, 0, lst.length-1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(lst));
    }

    // Main function that sorts arr[l..r] using
    // merge()

    public static void sort(int[] lst, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            // Find the middle point
            int m = (firstIndex+lastIndex)/2;

            // Sort first and second halves
            sort(lst, firstIndex, m); //sort the entire first half of this array before slicing and sorting the second half
            sort(lst, m+1, lastIndex);

            // Merge the sorted halves
            merge(lst, firstIndex, m, lastIndex); //first call will be 4 and 4 for an 8 array list, the next call will be 2/2/2/2, 3 calls will be 1/1/1/1/1/1/1/
            //1. split into 2, 2. split into 2 again, 3. split into 2 again
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]

    public static void merge(int [] lst, int firstIndex, int m, int lastIndex) {
        // Find sizes of two subarrays to be merged
        int leftLength = m - firstIndex + 1;
        int rightLength = lastIndex - m;

        /* Create temp arrays */
        int L[] = new int [leftLength];
        int R[] = new int [rightLength];

        /*Copy data to temp arrays*/
        for (int i=0; i<leftLength; ++i) {
            L[i] = lst[firstIndex + i];
        }
        for (int j=0; j<rightLength; ++j) {
            R[j] = lst[m + 1 + j];
        }


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int newIndex = firstIndex;

        while (i < leftLength && j < rightLength) {
            if (L[i] <= R[j]) {
                lst[newIndex] = L[i];
                i++;
            }
            else {
                lst[newIndex] = R[j];
                j++;
            }
            newIndex++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < leftLength) {
            lst[newIndex] = L[i];
            i++;
            newIndex++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightLength) {
            lst[newIndex] = R[j];
            j++;
            newIndex++;
        }
    }
}
/* This code is contributed by Rajat Mishra https://www.geeksforgeeks.org/merge-sort/ */





