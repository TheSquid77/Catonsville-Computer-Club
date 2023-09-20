import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {

        System.out.println("The answer is " + multiply(2783, 10923) + "!");
        
    }


    public static int multiply(int i, int j) {

        int ans = i*j + i + j;

        return ans;
        
    }
}