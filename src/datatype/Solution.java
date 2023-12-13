package datatype;

import java.util.*;
import java.io.*;


class Solution {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String numString = sc.nextLine();
            System.out.println(whoCanFitTheNumber(numString));
        }

    }

    static String whoCanFitTheNumber(String numString)
    {
        String answer = "";
        try{
            long num = Long.parseLong(numString);
            answer = numString + " can be fitted in:\n";
            if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
                answer = answer.concat("* byte\n* short\n* int\n* long");
            }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
                answer = answer.concat("* short\n* int\n* long");
            }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
                answer = answer.concat("* int\n* long");
            }else{
                answer = answer.concat("* long");
            }
        }catch (NumberFormatException e){
            answer = numString+" can't be fitted anywhere.";
        }
        return answer;
    }
}



