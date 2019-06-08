package problemsolving.easy.birthdaycakecandles;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int length = ar.length;
        int maxInt = Integer.MIN_VALUE;
        int candleCounter = 0;

        for (int i = 0; i < length; i++) {
            if(ar[i]>maxInt){
                maxInt = ar[i];
                candleCounter = 1;
            } else if (ar[i]==maxInt){
                candleCounter++;
            }
        }

        return candleCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
