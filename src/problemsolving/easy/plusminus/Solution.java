package problemsolving.easy.plusminus;

import java.util.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int length = arr.length;
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        for (int a :
                arr) {
            if (a > 0) {
                positiveCounter++;
            } else if (a < 0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        }

        float positiveRatio = (float) positiveCounter / length;
        float negativeRatio = (float) negativeCounter / length;
        float zeroRatio = (float) zeroCounter / length;

        System.out.println(positiveRatio+"");
        System.out.println(negativeRatio+"");
        System.out.println(zeroRatio+"");

    }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main (String[]args){
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            plusMinus(arr);

            scanner.close();
        }
    }

