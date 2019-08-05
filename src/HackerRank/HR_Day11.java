package HackerRank;

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

	Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		this.testScores = testScores;
	}
	
	public String calculate() {
		String result = "";
        int sum = 0;

        for (int i=0; i<testScores.length; i++){
            sum = sum + testScores[i];
        }

        sum = sum / testScores.length;

        if (sum >= 90){
            result = "O";
        } else if (sum >= 80){
            result = "E";
        } else if (sum >= 70){
            result = "A";
        } else if (sum >= 55){
            result = "P";
        } else if (sum >= 40){
            result = "D";
        } else {
            result = "T";
        }

        return result;
	}
	
}

public class HR_Day11 {
    
	/**
	 * samples
Aakansha Doshi 7825621
4
31 32 34 35
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		int[] testScores2 = {90, 90}; 
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		Student j = new Student("Junsam", "Ji", 1310199, testScores2);
		//s.printPerson();
		//System.out.println("Grade: " + s.calculate() );
				
		j.printPerson();
		System.out.println("Grade: " + j.calculate() );

	}

}
