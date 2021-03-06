package project5;

import java.io.*;
import java.util.*;

/**
 * A program to print for staff a list of hotel reservations for their program
 * participants.
 * 
 * @author Margo Theobald <mtheobal@skidmore.edu>
 *
 */
public class Project5 {
	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		Events e = new Events("hotelrooms.txt", "staff.txt");
		System.out.println(e);
	}
}
