package hackerrank;

import java.io.*;
import java.util.*;

//Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.
//Sample Input
//
//5
//12 0 1 78 12
//2
//Insert
//5 23
//Delete
//0
//Sample Output
//
//0 1 78 12 23
public class JavaList {

    // public static void insert(int x, int y, List<Integer> arr) {
    //     arr.set(x, y);
    // }
    public static void insert(int x, int y, List<Integer> arr) {
   
        arr.add(x, y);
   
    }
    
     public static void delete(int x,List<Integer> arr) {
   
        arr.remove(x);
   
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            arr.add(sc.nextInt());
        }
        int Q = sc.nextInt();
        // sc.nextLine(); // Consume the newline character

        for (int j = 0; j < Q; j++) {
            String instruction = sc.next();
            // System.out.println(instruction);
            if (instruction.equals("Insert")) { // Use .equals() for String comparison
                int index = sc.nextInt();
                int newValue = sc.nextInt();
                //  System.out.print(index+ " ");
                // sc.nextLine(); // Consume the newline character
                insert(index, newValue, arr);
            }
            
             if (instruction.equals("Delete")) { // Use .equals() for String comparison
                int index = sc.nextInt();
                  
                delete(index,arr);
             }
        }

        // Print the modified list
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


