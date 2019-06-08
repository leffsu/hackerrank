package problemsolving.easy.caesarcipher;

import java.io.*;
import java.util.*;

public class Solution {

    static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static final String alphabetUppercase = alphabet.toUpperCase();

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean uppercase = Character.isUpperCase(s.charAt(i));

            int indexInAlphabet;

            if(uppercase){
                indexInAlphabet = alphabetUppercase.indexOf(s.charAt(i));
            } else {
                indexInAlphabet = alphabet.indexOf(s.charAt(i));
            }

            if (indexInAlphabet == -1) {
                stringBuilder.append(s.charAt(i));
            } else {
                int newIndexInAlphabet = indexInAlphabet + k;
                if(uppercase){
                    stringBuilder.append(alphabetUppercase.charAt(newIndexInAlphabet % alphabetUppercase.length()));
                } else {
                    stringBuilder.append(alphabet.charAt(newIndexInAlphabet % alphabet.length()));
                }

            }
        }
        return stringBuilder.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
