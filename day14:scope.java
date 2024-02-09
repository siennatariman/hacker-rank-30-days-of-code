import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    private int storageLargest = 0;
    private int storageSmallest = 111;

	// Add your code here
    Difference(int[] weAreNumbers){
        this.elements = weAreNumbers;
    };
    private void computeDifference(){
        for(int i=0; i<elements.length; i++){
            if(elements[i]>storageLargest){
                storageLargest = elements[i];
            }
        }
        for(int j=0; j<elements.length; j++){
            if(elements[j]<storageSmallest){
                storageSmallest = elements[j];
            }
        }
    }

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