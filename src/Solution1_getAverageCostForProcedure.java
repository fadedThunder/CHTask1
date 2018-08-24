import java.util.ArrayList;
import java.util.List;

public class Solution1_getAverageCostForProcedure {

	public static void main(String[] args) {
		String procedureCosts = "PRO-A:10||PRO-B:15||PRO-A:05||PRO-C:125||PRO-B:25";
		String procedureCode = "PRO-A"; // PRO-D (Negative scenario)
		System.out.println(getAverageCostForProcedure(procedureCosts, procedureCode));
	}

	public static float getAverageCostForProcedure(String procedureCosts, String procedureCode) {
		if (!procedureCosts.contains(procedureCode)) {
			return 0f;
		} else {
			float averageTotal = 0;
			float temp;
			int counter = 0;
			String[] splitProCosts = procedureCosts.split("\\|\\|");
			for (int i = 0; i < splitProCosts.length; i++) {
				if (splitProCosts[i].contains(procedureCode)) {
					temp = Float.parseFloat(splitProCosts[i].replaceAll("[^0-9]", ""));
					averageTotal += temp;
					counter++;
				}
			}
			return averageTotal / counter;
		}
	}
}
