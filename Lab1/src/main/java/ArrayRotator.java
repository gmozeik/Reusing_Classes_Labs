import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by gerrodmozeik on 1/18/17.
 * Got loop help from here: http://www.geeksforgeeks.org/array-rotation/
 */
public class ArrayRotator extends ArrayList {

    ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        ArrayRotator arrayRotator = new ArrayRotator();
        int[] arr1 = {1, 2, 3, 4};
        arrayRotator.fillList(arr1);
        arrayRotator.rotateLeft(arr1, 2, 4);
        arrayRotator.printArray(arr1, 4);
    }


    public void fillList(int[] arr) {
        for (Integer num : arr) {
            list.add(num);
        }
        System.out.println(list);
    }

    public void rotateLeft(int[] arr1, int rotateBy, int arrayLength) {
        for (int i = 0; i < rotateBy; i++) {
            rotateLeftByOne(arr1, arrayLength);
        }
    }

    public void rotateLeftByOne(int[] arr1, int arrayLength) {
        int j, swap;
        swap = arr1[0];
        for (j = 0; j < arrayLength - 1; j++) {
            arr1[j] = arr1[j + 1];
        }
            arr1[j] = swap;
    }


    public void printArray(int[] arr1, int arrayLength) {
        int h;
        for (h = 0; h < arrayLength; h++) {
            System.out.print(arr1[h] + " ");
        }
    }
}

