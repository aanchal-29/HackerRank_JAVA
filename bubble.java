package hackerrank;

//public class  {

//}
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



public class bubble {
    
    // void swap(int a1,int b){
        
    //     int temp = a.get(a1);
    //             a.set(a1, a.get(b)); 
    //             a.set(b, temp);     
                  
    // }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            int endPosition=a.size();
int countSum=0;
    while( endPosition > 0 ){
        for (int i=0;i<n;i++){
            
            int count=0;
            for(int j=0;j<n-1;j++){
                if(a.get(j)>a.get(j+1)){
                    int temp = a.get(j);
                a.set(j, a.get(j+1)); 
                a.set(j+1, temp);
                //    swap(a.get(j),a.get(j+1)); 
                   count++;
                //    System.out.println("Printing List: "+a+"Swaps: "+count);  
                }
               
            }
             countSum+=count;
        }
         endPosition =0;
    }

System.out.println("Array is sorted in "+countSum +" swaps.");
System.out.println("First Element: "+a.get(0));
System.out.println("Last Element: "+a.get(n-1));

        bufferedReader.close();
    }
}
//3
//2 1 3
//Array is sorted in 1 swaps.
//First Element: 1
//Last Element: 3