/**
 * 
 */
package project4;

import java.io.*;
import java.util.*;

/**
 * @author Margo Theobald <mtheobal@skidmore.edu>
 * 
 *         Project 4 must: Use a Scanner and a File object to read the input
 *         from the file Compute the total balance of the checking, savings, and
 *         credit card accounts at the end of the month Opening balances and
 *         deposits are positive, withdrawals are negative Output the total
 *         balances for each account to an output file called output.txt
 */
public class Project4 {

	/**
	 * @param args
	 * 
	 * @throws FileNotFoundException
	 *             if the file is not found.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		// declare variables date, account, transaction, amount
		double checking = 0;
		double savings = 0;
		double credit = 0;

		while (fileReader.hasNext()) {
			// skip the date
			fileReader.next();
			if (fileReader.hasNext("Checking")) {
				fileReader.next();
				/**
				 * If next token is Opening, ignore Balance, add next double If
				 * next token is Withdrawal, subtract next double If next token
				 * is Deposit, add next double
				 */
				if (fileReader.hasNext("Opening")) {
					fileReader.next();
					fileReader.next();
					checking += fileReader.nextDouble();
				} else if (fileReader.hasNext("Withdrawal")) {
					fileReader.next();
					checking -= fileReader.nextDouble();
				} else if (fileReader.hasNext("Deposit")) {
					fileReader.next();
					checking += fileReader.nextDouble();

				}
			} else if (fileReader.hasNext("Savings")) {
				fileReader.next();
				if (fileReader.hasNext("Opening")) {
					fileReader.next();
					fileReader.next();
					savings += fileReader.nextDouble();
				} else if (fileReader.hasNext("Withdrawal")) {
					fileReader.next();
					savings -= fileReader.nextDouble();
				} else if (fileReader.hasNext("Deposit")) {
					fileReader.next();
					savings += fileReader.nextDouble();
				}
			} else if (fileReader.hasNext("Credit")) {
				fileReader.next();
				fileReader.next();
				if (fileReader.hasNext("Opening")) {
					fileReader.next();
					fileReader.next();
					credit += fileReader.nextDouble();
				} else if (fileReader.hasNext("Withdrawal")) {
					fileReader.next();
					credit -= fileReader.nextDouble();
				} else if (fileReader.hasNext("Deposit")) {
					fileReader.next();
					credit += fileReader.nextDouble();
				}
			}

		}
		fileReader.close();
		
		PrintStream output = new PrintStream (new File("src/output.txt"));
		
		output.println("Checking: " + checking);
		output.println("Savings: " + savings);
		output.println("Credit: " + credit);
		
		output.close();
	}

}
