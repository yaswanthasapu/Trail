package task;


import java.util.*;
public class IntegerArray {

    public static void main(String[] args) {
        int arr1[] = {6,7,5,9};
        int arr2[] = {1,2,3,4,8};
        int arr1L = arr1.length;
        int arr2L =arr2.length;
        int arr3L = arr1L + arr2L;
        int[] arr3 =new int[arr3L];
        for (int i = 0; i < arr1L; i = i + 1) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2L; i = i + 1) {
            arr3[arr1L + i] = arr2[i];
        }
        for (int i = 0; i < arr3L; i =i + 1) {
            //System.out.print(arr3[i]);
        }
        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));
    }
}