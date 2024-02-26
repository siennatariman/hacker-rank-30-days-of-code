import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    private Stack<Character> myStack = new Stack<>();
    private Queue<Character> myQueue = new LinkedList<>();
    char current;

    // Pushes a character onto a stack
    public void pushCharacter(char ch){
        this.myStack.push(ch);
    };
    
    // Enqueues a character in the queue instance variable
    public void enquequeCharacter(char ch){
        this.myQueue.offer(ch);
    };
    
    // Pops and returns the character at the top of the stack instance variable
    public char popCharacter(){
        current = this.myStack.peek();
        this.myStack.pop();
        
        return current;
    };
    
    // Dequeues and returns the firt character in the  queue instance variable
    public char dequequeCharacter(){
        current = this.myQueue.peek();
        this.myQueue.poll();
        
        return current;
    };



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}