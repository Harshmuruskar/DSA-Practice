package Arrays;

import java.util.Arrays;

public class PlusMInusSum {

    static int[] sum(int arr[]) {
        int positiveSum = 0;
        int negativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveSum += arr[i];
            } else {
                negativeSum += arr[i];
            }
        }

        return new int[]{positiveSum, negativeSum};
    }

    public static void main(String[] args) {
        int arr[] = {6, 4,-3,-4};

        System.out.println(Arrays.toString(sum(arr)));
    }
}
