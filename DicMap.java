package hackerrank;


import java.io.*;
import java.util.*;

public class DicMap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        
        Map<String,String> phoneBook=new HashMap<>(n);
        for(int i=0;i<n;i++){
            String name=sc.next();
           String num = sc.next();
            sc.nextLine();
            // phoneBook.put(phoneBook.getkey(),phoneBook.getValue());
             phoneBook.put(name,num);
        }
        
          while(sc.hasNext()){
        String queryName = sc.nextLine();
        if (phoneBook.containsKey(queryName)) {
            System.out.println(queryName + "=" + phoneBook.get(queryName));
        } else {
            System.out.println("Not found");
        }
          }
        // System.out.println(phoneBook.toString());
        // System.out.println(n);
    }
}

/*3
sam
gupta
sameer
raichand
chinmay
setty
chinmay
chinmay=setty
sameer
sameer=raichand
*/