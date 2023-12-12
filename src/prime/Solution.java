package prime;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        
        for(int i=0;i<n; i++){
            int number= sc.nextInt();
            isPrime(number);
        }
    }
    
    public static void isPrime(int number){
        
        if(number<=1){
            return;
        }
        
        
        for(int i=2; i<number; i++){
            if(number % i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
        
        
    }
}