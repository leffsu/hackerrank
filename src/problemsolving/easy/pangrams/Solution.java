package problemsolving.easy.pangrams;

import java.io.*;
import java.util.*;

public class Solution {

    static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    // Complete the problemsolving.easy.pangrams function below.
    static String pangrams(String s) {
        boolean stringIsPangram = false;
        s = s.toLowerCase();

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

        for (int i = 0; i < s.length(); i++) {
            int indexOfChar = characters.indexOf(s.charAt(i));
            if (indexOfChar != -1) {
                characters.remove(indexOfChar);
            }
        }

        if (characters.size() == 0)
            stringIsPangram = true;

        if (stringIsPangram) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
