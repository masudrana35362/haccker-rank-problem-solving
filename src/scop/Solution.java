package scop;

import java.util.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
      
    public Difference(int[] array){
        this.elements=array;
    }
    
    
    public void computeDifference(){
        int diff;
        for (int element : elements) {
            for (int j = 1; j < elements.length; j++) {
                diff = Math. abs(element - elements[j]);
                if (diff > maximumDifference) {
                    maximumDifference = diff;
                }
            }
        }

    }

	// Add your code here

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}