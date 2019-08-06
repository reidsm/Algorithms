import java.util.*;
public class BinarySearch {

    public static void main(String[] args){
        int[] lst = {13,15,16,17,19};
        int lowIndex = 0;
        int highIndex = lst.length-1;
        int target = 19;
        binarySearch(target, lst, lowIndex, highIndex);
    }

    public static void binarySearch(int target, int[] lst, int lowIndex, int highIndex){
        if(lowIndex > highIndex){
            System.out.println("not found");
        }

        int middle = (lowIndex+highIndex)/2;
        System.out.println(Arrays.toString(lst));
        System.out.println(middle);
        System.out.println(lst[middle]);

        if(lst[middle] == target){
            System.out.println("the target is at index " + middle);
        }else if(lst[middle] < target){
            lowIndex = middle+1;
            highIndex = highIndex;
            System.out.println("lessthan");
            binarySearch(target, lst, lowIndex, highIndex);
        }else if(lst[middle] > target){
            lowIndex = lowIndex;
            highIndex = middle-1;
            System.out.println("greaterthan");
            binarySearch(target, lst, lowIndex, highIndex);
        }else{
            System.out.println("error");
        }

    }



}
