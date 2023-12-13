package pallindrom;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String n="";
        for(int i= A.length()-1; i>=0;--i){
            n = n+ A.charAt(i);
        }

        System.out.println(n);
        if(A.equalsIgnoreCase(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}



