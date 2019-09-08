package arrays;

import java.util.Arrays;

public class Arrays1 {
    // note: Arrays.toString() prints an array in the form [element1, element2, ..., elementN]
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5, 6};
        mystery(input1);

        int[] input2 = {-3, 3, -5, 8, 5};
        mystery(input2);

        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));

        mystery(input2);
        System.out.println(Arrays.toString(input2));
    }

    public static void mystery(int[] array){
        for(int i = 0; i < array.length - 2; i++){
            array[i] = array[i] + array[i + 1] + array[i + 2];
        }
        for(int i = array.length - 2; i < array.length; i++){
            array[i] = array[i] + i;
        }
    }
}
