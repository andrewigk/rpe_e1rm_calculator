/**
 * 
 * 
 */
import java.util.HashMap;
import java.util.LinkedHashMap;

/** The RPETable class represents the table used as the source for the various 
 * percentages correlated with a given RPE rating.
 * 
 * Link to the original chart can be found here:
 * https://articles.reactivetrainingsystems.com/2016/01/06/customizing-your-rpe-chart/
 * 
 */
public class RPETable {
	
	HashMap<String, Double[]> table = new LinkedHashMap<>();	
	
	public RPETable() {
		/* Key values are the RPE rating scale, which typically go from 6 to 10 in .5 increments.
		 * The percentages associated with each RPE are stored in an array.
		 */
		table.put("10", new Double[] {100.0, 95.5, 92.2, 89.2, 86.3, 83.7, 81.1, 78.6, 76.2, 73.9});
		
		table.put("9.5", new Double[] {97.8, 93.9, 90.7, 87.8, 85.0, 82.4, 79.9, 77.4, 75.1, 72.3});
		
		table.put("9", new Double[] {95.5, 92.2, 89.2, 86.3, 83.7, 81.1, 78.6, 76.2, 73.9, 70.7});
		
		table.put("8.5", new Double[] {93.9, 90.7, 87.8, 85.0, 82.4, 79.9, 77.4, 75.1, 72.3, 69.4});
		
		table.put("8", new Double[] {92.2, 89.2, 86.3, 83.7, 81.1, 78.6, 76.2, 73.9, 70.7, 68.0});
		
		table.put("7.5", new Double[] {90.7, 87.8, 85.0, 82.4, 79.9, 77.4, 75.1, 72.3, 69.4, 66.7});
		
		table.put("7", new Double[] {89.2, 86.3, 83.7, 81.1, 78.6, 76.2, 73.9, 70.7, 68.0, 65.3});
		
		table.put("6.5", new Double[] {87.8, 85.0, 82.4, 79.9, 77.4, 75.1, 72.3, 69.4, 66.7, 64.0});
		
		table.put("6", new Double[] {86.3, 83.7, 81.1, 78.6, 76.2, 73.9, 70.7, 68.0, 65.3, 62.6});
		
	}
	
}
