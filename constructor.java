
package hackerrank;


import java.io.*;
import java.util.*;

public class constructor  {

        private int age=0;
        public constructor (int initialAge){
            if(initialAge<0){
                this.age=0;
                System.out.println("Age is not valid, setting age to 0.");
            }
            else{ 
            this.age=initialAge;
            }
            
            
        //     String result = (initialAge<0) ? System.out.println("Age is not valid, setting age to 0.") : this.age=initialAge;
        // // System.out.println(result);
            
        }
        
        public void yearPasses() {
            this.age++;
        }
        public void amIOld(){
            
            String pri=(this.age<13)? "You are young." : 
                        (this.age>=13 && this.age<18)? "You are a teenager." :
                        "You are old.";
                        System.out.println(pri);
        }
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of Test case:");
        int T= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
        	System.out.println("Enter no. to check amIOld:");
                int age = sc.nextInt();
                constructor  person= new constructor (age);
                person.amIOld();
                for (int j = 0; j < 3; j++) {
                        person.yearPasses();
                    }
                person.amIOld();
                
                System.out.println();   
        }

    }
}
