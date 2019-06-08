package problemsolving.easy.strongpassword;

import java.io.*;
import java.util.*;

public class Solution {

    static String numbers = "0123456789";
    static String lower_case = "abcdefghijklmnopqrstuvwxyz";
    static String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String special_characters = "!@#$%^&*()-+";

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        boolean passwordContainsDigit = false;
        boolean passwordContainsLowercaseEnglishChar = false;
        boolean passwordContainsUppercaseEnglishChar = false;
        boolean passwordContainsSpecialChar = false;

        int symbolsToAdd = 0;

        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);

            if (numbers.indexOf(character) != -1) {
                passwordContainsDigit = true;
            }
            if (lower_case.indexOf(character) != -1) {
                passwordContainsLowercaseEnglishChar = true;
            }
            if (upper_case.indexOf(character) != -1) {
                passwordContainsUppercaseEnglishChar = true;
            }
            if (special_characters.indexOf(character) != -1) {
                passwordContainsSpecialChar = true;
            }
        }

        if(!passwordContainsDigit){
            symbolsToAdd++;
        }
        if(!passwordContainsLowercaseEnglishChar){
            symbolsToAdd++;
        }
        if(!passwordContainsUppercaseEnglishChar){
            symbolsToAdd++;
        }
        if(!passwordContainsSpecialChar){
            symbolsToAdd++;
        }

        if((n+symbolsToAdd)<6){
            symbolsToAdd = 6-n;
        }
        return symbolsToAdd;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);
        System.out.println(answer);

//        bufferedWriter.write(String.valueOf(answer));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
