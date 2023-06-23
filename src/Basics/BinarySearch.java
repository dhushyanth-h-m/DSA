import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch{
    public static void binarySearchImpl(Integer array[], int value){
        int first = 0;
        int last = array.length;
        int mid = (first+last)/2;

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));
        Collections.sort(arrayList);
        while(first <= last){
            if(arrayList.get(mid) < value){
                first = mid+1;
            }
            else if(arrayList.get(mid) == value){
                System.out.println("Element " +value+" found at position "+ (mid+1));
                break;
            }
            else{
                last = mid-1;
            }
            mid = (first+last)/2;
        }
        if(first > last){
            System.out.println("Element not found!");
        }

        System.out.println("Array: "+arrayList);
    }
    public static void main(String[] args){
        Integer array[] = {23, 44, 63, 27, 84};

        binarySearchImpl(array, 63);
    }
}