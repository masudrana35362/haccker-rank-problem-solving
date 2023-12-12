import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            solve(a,b,n);
        }
        
        in.close();
    }
    
    public static void solve(int a,int b, int n ){

    for(int i=1; i<=n; i++ ){
        int sum=a;
        for (int j=1; j <=i; j++){
            System.out.print(sum+" ");
        }


      
    }
        
    }
}