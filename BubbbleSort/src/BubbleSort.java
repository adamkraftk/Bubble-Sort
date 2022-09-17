import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        // Main method, input array and call sort method.
        String[] myArr = {"right", "subdued", "trick", "crayon", "punishment", "silk", "describe", "royal", "prevent", "slope"};
        sort(myArr);
    }

    static void sort(String[] arr){
        // Determine the length of the array
        // Create temp string to temporarily hold the values of the array
        int len = arr.length;
        String temp = "";

        // Loop over the array as a whole.
        for(int i=0; i < len; i++){
            // Loop over each word in the array checking the nth index against the nth index - 1;
            for(int j = 1; j < (len-i); j++) {
                // Swap the values depending on the length of the word in the array.
                // E.g, if index 0 is greater than index 1. Swap.
                if (arr[j - 1].length() > arr[j].length()) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

}
