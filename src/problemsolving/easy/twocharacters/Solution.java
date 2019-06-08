package problemsolving.easy.twocharacters;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class Solution {

    // Complete the alternate function below.
    static int alternate(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        int maxAlternateStringLength = 0;

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), s.charAt(i));
        }

        char[] chars = new char[hashMap.keySet().size()];

        Iterator<Character> iterator = hashMap.keySet().iterator();


        for (int i = 0; i < hashMap.keySet().size(); i++) {
            chars[i] = iterator.next();
        }

        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                String newString = "";

                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == chars[i] || s.charAt(k) == chars[j]) {
                        newString = newString.concat(String.valueOf(s.charAt(k)));
                    }
                }

                boolean good = true;

                for (int k = 1; k < newString.length(); k++) {

                    if (newString.charAt(k - 1) != newString.charAt(k)) {

                    } else {
                        good = false;
                        break;
                    }

                }

                if (good) {
                    if (maxAlternateStringLength < newString.length()) {
                        maxAlternateStringLength = newString.length();
                    }
                }
            }
        }

        if (maxAlternateStringLength == 1)
            return 0;

        return maxAlternateStringLength;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = alternate(s);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
