/**
 * 
 */
package project2;

/**
 * Project 2 assignment is to create a What kind of X are you quiz that uses:
 * ~Prompting the user for input
 * ~Conditions, including String comparison
 * ~Cumulative algorithm to score responses
 * 
 * This program is a quiz to determine how healthy the user eats based on response.
 * @author Margo Theobald <mtheobal@skidmore.edu>
 *
 */
// tells java to bring in the scanner utility
import java.util.*;

public class Project2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Declare variables to keep track of criteria. */
		System.out.println("Take this quiz to evaluate your eating habits");

		/* Declare a scanner console*/
		Scanner console = new Scanner(System.in);
		int healthFactor = 0;
		healthFactor += question1(console);
		healthFactor += question2(console);
		healthFactor += question3(console);
		healthFactor += question4(console);
		if (healthFactor>=13){
			System.out.println("Your eating habits are healthy, but you might want to have a little treat.");
			
		} else if (healthFactor <=12 && healthFactor>=9){
			System.out.println("Your eating habits are right on track.")
		} else if
	}

	public static int question1(Scanner console) {
		System.out.println("What do you eat for breakfast on Saturday morning?");
		System.out.println("A: Oatmeal with Greek yogurt");
		System.out.println("B: Eggs, bacon, homefries, and toast");
		System.out.println("C: Waffles with whipped cream and syrum");
		System.out.println("D: Fruit smoothie");
		System.out.print("Please choose the answer that best describes you:"); 
			String answer = console.nextLine();
			
			/* Evaluate the answer provided by the quizee*/
			if (answer.equals("A")){
				return 3;
			} else if (answer.equals("B")){
				return 2;
			} else if (answer.equals("C")){
				return 1;
			} else return 4;
			
		}

	public static int question2(Scanner console) {
		System.out.println("After a long week at work, you're too tired to \"really\" cook.  What do you have for dinner Friday night?");
		System.out.println("A: Cheese and crackers, fruit, and a glass of wine");
		System.out.println("B: Pizza and wings, I have them on speed-dial");
		System.out.println("C: Stop at the grocery store for take-out sushi and salad bar");
		System.out.println("D: Good thing I started a roast in the crock pot this morning");
		System.out.print("Please choose the answer that best describes you:"); 
		String answer = console.nextLine();
		
		/* Evaluate the answer provided by the quizee*/
		if (answer.equals("A")){
			return 2;
		} else if (answer.equals("B")){
			return 1;
		} else if (answer.equals("C")){
			return 3;
		} else return 4;
	}

	public static int question3(Scanner console) {
		System.out.println("What do you drink throughout the day?");
		System.out.println("Water");
		System.out.println("Gatorade, Powerade, or Vitamin Water");
		System.out.println("Soda");
		System.out.println("Coffee or tea");
		System.out.print("Please choose the answer that best describes you:"); 
		String answer = console.nextLine();
		
		/* Evaluate the answer provided by the quizee*/
		if (answer.equals("A")){
			return 4;
		} else if (answer.equals("B")){
			return 3;
		} else if (answer.equals("C")){
			return 1;
		} else return 2;
	}

	public static int question4(Scanner console) {
		System.out.println("How many nights a week do you eat dessert?");
		System.out.println("Never");
		System.out.println("1-3 nights a week");
		System.out.println("4-6 nights a week");
		System.out.println("Every night");
		System.out.print("Please choose the answer that best describes you:"); 
		String answer = console.nextLine();
		
		/* Evaluate the answer provided by the quizee*/
		if (answer.equals("A")){
			return 4;
		} else if (answer.equals("B")){
			return 3;
		} else if (answer.equals("C")){
			return 2;
		} else return 1;
	}
/* calculate results*/
	



	}
