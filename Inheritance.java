package hackerrank;



import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public String calculate() {
        String st = null;
        int tem = 0;
        for(int i = 0; i < testScores.length; i++) 
            tem += testScores[i];
        
       double avre = ((tem)/testScores.length);
        if(avre >= 90 && avre <= 100){
            st = "O";
        } else if(avre >= 80 && avre < 90) {
            st = "E";
        } else if(avre >= 70 && avre < 80) {
            st = "A";
        } else if(avre >= 55 && avre < 70) {
            st = "P";
        } else if(avre >= 40 && avre < 55) {
            st = "D";
        } else if(avre < 40) {
            st = "T";
        }
        
        return st;
}
}

class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}


//aanchal
//gupta
//47
//2
//100
//80
//Name: gupta, aanchal
//ID: 47
//Grade: O
