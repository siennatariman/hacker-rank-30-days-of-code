import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int tracker = 1;
        int result;
        for(int i=1; i<11; i++){
            result = n * tracker;
            System.out.println(n + " x " + i + " = " + result);
            tracker++;
        }

        bufferedReader.close();
    }
}
