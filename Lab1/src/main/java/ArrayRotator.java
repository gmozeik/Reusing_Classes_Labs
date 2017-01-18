import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by gerrodmozeik on 1/18/17.
 */
public class ArrayRotator extends ArrayList {

    public static void main(String[] args) {
        ArrayRotator arrayRotator = new ArrayRotator();
        int arr[] = {1, 2, 3, 4};
        arrayRotator.rotateLeft(arr, 2, 4);
        arrayRotator.printArray(arr, 4);
    }

        public void rotateLeft(int arr[], int rotateBy, int arrayLength) {
            for (int i = 0; i < rotateBy; i++) {
                rotateLeftByOne(arr, arrayLength);
            }
        }

        public void rotateLeftByOne(int arr[], int arrayLength) {
            int j, swap;
            swap = arr[0];
            for (j = 0; j < arrayLength - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = swap;
        }


        public void printArray(int arr[], int arrayLength) {
            int h;
            for (h = 0; h < arrayLength; h++) {
                System.out.print(arr[h] + " ");
            }
        }
}

