package militaryformat;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) throws ParseException {
    // Write your code here
        DateFormat format = new SimpleDateFormat("hh:mm:ssa");
        Date date = format.parse(s);
        DateFormat format2 = new SimpleDateFormat("HH:mm:ss");
        return  format2.format(date);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
