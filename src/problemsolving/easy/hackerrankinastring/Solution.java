package problemsolving.easy.hackerrankinastring;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        List<Character> hackerrank = new ArrayList<>(Arrays.asList('h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'));

        boolean foundAlLLetters = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == hackerrank.get(0)) {
                hackerrank.remove(0);
            }
            if (hackerrank.size() == 0) {
                foundAlLLetters = true;
                break;
            }
        }

        if (foundAlLLetters) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);
            System.out.println(result);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
