package bitwise;

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

public class Solution {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        for (;;){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a & b);
            System.out.println(b & a);
        }

    }
}
