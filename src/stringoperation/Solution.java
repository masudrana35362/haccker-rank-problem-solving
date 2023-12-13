package stringoperation;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sumChar= A.length() + B.length();
        
       int com= A.compareTo(B);
        System.out.println(com);
        
        System.out.println(sumChar);
        System.out.println(com>0?"Yes":"No");
        System.out.println(capitalize(A)+" "+capitalize(B));
        
    }
    //user-defined function to capitalize the first letter also check for null string  
public static final String capitalize(String str)   
{  
if (str == null || str.length() == 0) return str;  
return str.substring(0, 1).toUpperCase() + str.substring(1);  
} 
}



