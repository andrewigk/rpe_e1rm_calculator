import java.util.Scanner;
/**
 * 
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String rpe = null;
	String report = null;
	double load = 0.0;
	int reps = 0;
	double e1rm = 0.0;
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the load used in KG: ");
	load = input.nextDouble();
	input.nextLine();
	System.out.println("Enter the number of reps performed: ");
	reps = input.nextInt();
	input.nextLine();
	System.out.println("Enter the RPE (6-10, in .5 increments: ");
	rpe = input.nextLine();
	
	Utility calculator = new Utility();
	e1rm = calculator.calculateE1RM(load, reps, rpe);
	
	System.out.println("Your estimated 1 rep maximum is: " + e1rm + "KG.");
	System.out.println();	
	System.out.printf("Enter the target rep range you are looking for. \n"
			+ "Based on your inputted load/rep/RPE and E1RM, \n"
			+ "a table will be displayed with the recommended load \n"
			+ "at specific RPE increments.");
	reps = input.nextInt();
	input.nextLine();
	System.out.println();
	
	report = String.format("Displaying load recommendations for %d reps: %n", reps);
	report += String.format("-------------------%n");
	report += String.format("| %-5s | %-7s |", "RPE: ", "Load: ");
	report += calculator.generateReport(reps, e1rm);
	System.out.println(report);
	
	
	
	
	
	}

}
