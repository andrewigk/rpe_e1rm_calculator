/**
 * Assessment: 
 * Student Name: Andrew Kim
 * Due Date:
 * Description: 
 * Professor Name:
 * 
 */

/**
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Utility {
	
	
	public Utility() {
		
	}
	
	RPETable rpeTable = new RPETable();
	
	
	/* This method calculates the E1RM based on the user input of the load
	 * used, the number of reps performed, and the RPE rating.
	 * The method makes use of the Map.Entry interface to iterate through
	 * the hashmap from the RPETable Class.
	 * If the RPE specified by the user matches with the key of the RPE Table,
	 * the E1RM will be calculated based on that column's values using reps-1
	 * to determine the correct element of the array to determine number of reps.
	 * 
	 * The calculation used to determine E1RM is: load / percentage * 100.
	 */
	public double calculateE1RM(double load, int reps, String rpe) {
		double e1rm = 0.0;
		
		for (Map.Entry<String, Double[]> entry : rpeTable.table.entrySet()) {
            if (entry.getKey().equals(rpe)) {
            	e1rm = (load /(entry.getValue()[reps-1])) * 100;
            	e1rm = Math.round(e1rm / 2.5) * 2.5;
            	}
           }
		return e1rm;
		}
		
	
	public String generateReport(int reps, double e1rm){
		String report = "";
		double percentageLoad = 0.0;
		
		for (Map.Entry<String, Double[]> entry : rpeTable.table.entrySet()) {
			percentageLoad = (e1rm * entry.getValue()[reps-1]) / 100;
			percentageLoad = Math.round(percentageLoad / 2.5) * 2.5;
			report += String.format("%n-------------------%n");
			report += String.format("| %-5s | %-7.1f |", entry.getKey(),percentageLoad);
	}
		report += String.format("%n-------------------%n");
		return report;
		
	
	}
	
}
	

	

