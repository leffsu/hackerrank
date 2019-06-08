package problemsolving.easy.minimaxsum;

import java.util.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int maxInt = Integer.MIN_VALUE;
        int minInt = Integer.MAX_VALUE;
        int inderOfMaxInt = 0;
        int indexOfMinInt = 0;
        long minSumCounter = 0;
        long maxSumCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
                inderOfMaxInt = i;
            }

            if (arr[i] < minInt) {
                minInt = arr[i];
                indexOfMinInt = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != inderOfMaxInt) {
                minSumCounter += arr[i];
            }
            if (i != indexOfMinInt) {
                maxSumCounter += arr[i];
            }
        }

        System.out.println(minSumCounter + " " + maxSumCounter);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
