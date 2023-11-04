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



public class TwoDarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        int sum = -100;
    for(int i = 0; i < 4; i++) {
      int temp;
        for(int j = 0; j < 4; j++) {
            temp = 0;
                temp += arr.get(i).get(j);
                temp += arr.get(i).get(j+1);
                temp += arr.get(i).get(j+2);
                temp += arr.get(i+1).get(j+1);
                temp += arr.get(i+2).get(j);
                temp += arr.get(i+2).get(j+1);
                temp += arr.get(i+2).get(j+2);

                if(temp > sum ) {
                    sum = temp;
                }
        }
    }
    System.out.println(sum);
}
    
}
