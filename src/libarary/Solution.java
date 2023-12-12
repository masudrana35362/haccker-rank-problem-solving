package libarary;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int d2 = sc.nextInt(), m2 = sc.nextInt(), y2 = sc.nextInt();  // returned date
        int d1 = sc.nextInt(), m1 = sc.nextInt(), y1 = sc.nextInt();   // due date

        if (y2 > y1) {
            System.out.println(10000);
        } else if (y2 < y1 || m2 < m1 || m2 == m1 && d2 <= d1) {
            System.out.println(0);
        } else if (m1 == m2) {
            int days = d2 - d1;
            System.out.println(15 * days);
        } else {
            int month = m2 - m1;
            System.out.println(500 * month);
        }
    }
}