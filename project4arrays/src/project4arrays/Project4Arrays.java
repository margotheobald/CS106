/**
 * 
 */
package project4arrays;

import java.util.*;
import java.io.*;

/**
 * @author Margo Theobald <mtheobal@skidmore.edu>
 *
 */
public class Project4Arrays {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 *             if the file is not found.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		// count lines in input.txt
		int lines = 0;
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			lines++;
		}
		fileReader.close();

		// a good way to test: System.out.println (lines);

		// reset to beginning of file

		int index = 0;
		/**
		 * create arrays, seed with number of lines in file, tell how big they
		 * need to be.
		 */
		String[] dates = new String[lines];
		String[] accounts = new String[lines];
		String[] transactions = new String[lines];
		double[] amounts = new double[lines];

		fileReader = new Scanner(new File("src/input.txt"));
		while (fileReader.hasNext()) {

			// store the date in the array
			dates[index] = fileReader.next();

			accounts[index] = fileReader.next();
			if (accounts[index].equals("Credit")) {
				accounts[index] = accounts[index] + " " + fileReader.next();
			}
			transactions[index] = fileReader.next();
			if (transactions[index].equals("Opening")) {
				transactions[index] = transactions[index] + " "
						+ fileReader.next();
			}
			amounts[index] = fileReader.nextDouble();
			index++;
		}
		fileReader.close();

		// calculate totals

		double checking = 0.0;
		double savings = 0.0;
		double credit = 0.0;
		for (index = 0; index < dates.length; index++) {
			if (accounts[index].equals("Checking")) {
				if (transactions[index].equals("Withdrawal")) {
					checking -= amounts[index];
				} else {
					checking += amounts[index];
				}
			} else if (accounts[index].equals("Savings")) {
				if (transactions[index].equals("Withdrawal")) {
					savings -= amounts[index];
				} else {
					savings += amounts[index];
				}
			} else {
				if (transactions[index].equals("Withdrawal")) {
					credit -= amounts[index];
				} else {
					credit += amounts[index];
				}
			}
		}
		System.out.println("Checking balance is $" + checking);
		System.out.println("Savings balance is $" + savings);
		System.out.println("Credit Card balance is $" + credit);

	}
}
