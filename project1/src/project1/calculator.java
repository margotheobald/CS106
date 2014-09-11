/**
 * 
 */
package project1;

/**
 * @author Margo
 *
 */
public class calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables 
		fourYears(4);
		fiveYears(5);
	}
		
		// Compute amount of money paid back on a car loan over four years at a fixed rate
		// Compound interest formula, 12 = number of payments per year
		public static void fourYears(int t) {
			double P = 25000;
			double r = 0.0499;
			double A;
			A = P * Math.pow((1 + (r/12)), 12*t);
		
		
		// Print results	
		System.out.println("Total paid after four years:");
		System.out.println(A);

		}			
		// Compute amount of money paid back on a car loan over five years at a fixed rate	
		public static void fiveYears(int t) {
			double P = 25000;
			double r = 0.0499;
			double A;
			A = P * Math.pow((1 + (r/12)), 12*t);
			
		// Print results
		System.out.println("Total paid after five years:");
		System.out.println(A);

		
		
	
	}
}
