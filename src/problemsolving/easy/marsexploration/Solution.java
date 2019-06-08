package problemsolving.easy.marsexploration;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        int anomalyCounter = 0;
        String originalString = "SOS";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != originalString.charAt(i % originalString.length())) {
                anomalyCounter++;
            }
        }

        return anomalyCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
