package minmax;

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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int min= 0;
    int max=0;
    int minIndex= getMin(arr);
        System.out.println(minIndex);
    int maxIndex= getMax(arr);
        System.out.println(maxIndex);
    
    for(int i=0; i<arr.size(); i++){
        if(minIndex!=i){
           min+=arr.get(i); 
        }
        
    }
    
    for(int i=0; i<arr.size(); i++){
      
        if(maxIndex!=i){
              max +=arr.get(i);
        }
    }
    
    System.out.println(min+" "+ max);

    }
    
    public static int getMax(List<Integer> arr){
        int index=0; 
        for(int i=1; i<arr.size(); i++){
            if(arr.get(index)>arr.get(i)){
                index=i;
            }
        }
        return index;
    }
    
    public static int getMin(List<Integer> arr){
          int index=0; 
        for(int i=1; i<arr.size(); i++){
            if(arr.get(index)<arr.get(i)){
                index=i;
            }
        }
        return index;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
