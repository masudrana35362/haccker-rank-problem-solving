package plushminus;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int postive=0;
    int negative=0;
    int zero=0;
    for(int n: arr){
        if(n>0){
            postive+=1;
        }else if(n<0){
            negative+=1;
        }else if(n==0){
            zero+=1;
        }
    }
    float pr= (float) postive /arr.size();
        float nr= (float) negative/arr.size();
        float zr= (float) zero/arr.size();
    System.out.println(pr);
    System.out.println(nr);
    System.out.println(zr);
    

    }

}