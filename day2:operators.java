import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here

    meal_cost += (meal_cost * (tip_percent/100.0)) + (meal_cost * (tax_percent/100.0));
    meal_cost = Math.round(meal_cost);

    /*
        In the line where you calculate the tip and tax amounts, you are performing integer division, 
        which results in truncating the decimal part. This leads to incorrect calculations. 
        To fix this, you should convert at least one of the operands to a double before performing the division.
        Changed '100' to '100.0'

    */ 
    
    System.out.println((int)meal_cost);
    }
    
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
