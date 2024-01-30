import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    // Create a Scanner object to read input from STDIN  
    Scanner scanner = new Scanner(System.in);  
    
    // Firt input is an integer = number of test cases/strings
    int numTestCase = scanner.nextInt();
    
    /*
    ISSUE: After reading an integer using nextInt(), there is still a  newline character ('\n') 
    left in the buffer. When you then call nextLine() to read the strings, 
    it consumes this newline character, resulting in an empty string for the first iteration of the loop.

    To fix this, add an extra scanner.nextLine() after reading the number of test cases to 
    consume the remaining newline character.
    
    
    */
    
    
    // Consume the newline character left in the buffer
    scanner.nextLine();
    // Counter to keep track of the number of strings received
    int counter = 0;
    
    // Keep receiving input until specified num. is reached
    while(counter < numTestCase){
        String stringInput = scanner.nextLine();
        
        String storeEven = new String();
        String storeOdd = new String();
        
        for(int i=0; i<stringInput.length(); i+=2){
        storeEven = storeEven + stringInput.charAt(i);
        }
        
        for(int m=1; m<stringInput.length(); m+=2){
        storeOdd = storeOdd + stringInput.charAt(m);
        }
        System.out.println(storeEven + " " + storeOdd);
        counter++;
    }
    
    // Close the scanner to avoid resource leaks
    scanner.close();
    
    }
}