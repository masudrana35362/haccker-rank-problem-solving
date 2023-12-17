package staircase;
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
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here

    for(int i=1; i<=n;i++){
        for(int k=n-i; k>0 ; k--){
            System.out.print(" ");
        }
        for(int j=i;j>0; j--){
            System.out.print("#");
        }
        System.out.println();
    }

    }

}