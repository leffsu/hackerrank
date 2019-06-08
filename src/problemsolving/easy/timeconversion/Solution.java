package problemsolving.easy.timeconversion;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] elements = s.split(":");
        System.out.println(elements[2]);
        String secondsString = elements[2].substring(0, 2);
        String retardedFormatAddition = elements[2].substring(2, 4);
        int hours = Integer.parseInt(elements[0]);
        int minutes = Integer.parseInt(elements[1]);
        int seconds = Integer.parseInt(secondsString);


        if (retardedFormatAddition.equals("PM") && hours != 12) {
            hours += 12;
        } else if (retardedFormatAddition.equals("AM") && hours == 12) {
            hours -= 12;
        }

        String hourToOutput = getCorrectTimeElement(hours);
        String minuteToOutput = getCorrectTimeElement(minutes);
        String secondToOutput = getCorrectTimeElement(seconds);

        return hourToOutput + ":" + minuteToOutput + ":" + secondToOutput;
    }

    private static String getCorrectTimeElement(int timeElement) {
        String elementToOutput;
        if (timeElement > 10) {
            elementToOutput = String.valueOf(timeElement);
        } else {
            elementToOutput = "0".concat(String.valueOf(timeElement));
        }
        return elementToOutput;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
    }
}
