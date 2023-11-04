package hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class DecToBin {
    static int max=0;
   static  Stack<Integer> stk= new Stack<>();
    
    static String DecToBin(int n){
         int maxCount = 0;
        int currentCount = 0;
        
        while(n>0){
        int r1=n%2;
        n=n/2;
        stk.push(r1); 
        
         if (r1 == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
            
        }
       
        StringBuilder binary = new StringBuilder();
        while (!stk.isEmpty()) {
            binary.append(stk.pop());
        }
max= maxCount;
        return binary.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binary = DecToBin(n);
        // System.out.println("Binary Representation: " + binary);
        System.out.println(max);
        
        bufferedReader.close();
    }
}
