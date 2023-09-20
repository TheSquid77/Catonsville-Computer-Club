import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {

        System.out.println(multiply(3729, 1932));
        
    }

    public static int multiply(int i, int j) {

        int ans = i*j + i + j;

        return ans;
        
    }

    
}