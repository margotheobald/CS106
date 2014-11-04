/**
 * 
 */
package project5;

import java.io.*;
import java.util.*;

/**
 * @author Margo Theobald <mtheobal@skidmore.edu>
 *
 */
public class Events {

	private Guest[] guestList;
	private Staff[] staffList;
	private String[] staffNames;
	private int staffIndex;
	private int guestIndex;

	/**
	 * Create a constructor to read files takes in file name for the guest list
	 * and staff list
	 * 
	 * @param guestListFile
	 * @param staffListFile
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public Events(String guestListFile, String staffListFile)
			throws FileNotFoundException, IOException {
		// create string tokenizer and a buffered reader
		StringTokenizer st;
		BufferedReader theFile = new BufferedReader(new FileReader(
				guestListFile));
		BufferedReader theStaffFile = new BufferedReader(new FileReader(
				staffListFile));
		this.guestList = new Guest[10];
		guestIndex = 0;
		this.staffList = new Staff[10];
		this.staffNames = new String[10];
		staffIndex = 0;
		// reading files delimiter is $ for all text files.
		// .trim removes white spaces
		while (theStaffFile.ready()) {
			String theLine = theStaffFile.readLine();
			st = new StringTokenizer(theLine, "$");
			String program = st.nextToken().trim();
			String name = st.nextToken().trim();
			Staff s = new Staff(name, program);
			staffList[staffIndex] = s;
			staffNames[staffIndex] = name;
			staffIndex++;
		}
		theStaffFile.close();

		while (theFile.ready()) {
			String theLine = theFile.readLine();
			st = new StringTokenizer(theLine, "$");
			String name = st.nextToken().trim();
			String email = st.nextToken().trim();
			String hotel = st.nextToken().trim();
			String arrival = st.nextToken().trim();
			String departure = st.nextToken().trim();
			String program = st.nextToken().trim();
			Guest g = new Guest(name, email, hotel, arrival, departure, program);
			add(g);
			for (int i = 0; i < staffIndex; i++) {
				if (staffList[i].getProgram().equals(g.getProgram())) {
					staffList[i].add(g);
					break;
				}
			}
		}
		theFile.close();
	}

	/**
	 * This method takes in a guest object and adds to the guest array
	 * 
	 * @param g
	 */

	public void add(Guest g) {
		if (guestIndex >= guestList.length) {
			Guest temp[] = new Guest[guestList.length + 10];
			for (int i = 0; i < guestList.length; i++) {
				temp[i] = guestList[i];
			}
			temp[guestIndex] = g;
			guestList = temp;
			guestIndex++;
		} else {
			guestList[guestIndex] = g;
			guestIndex++;
		}
	}

	/**
	 * @return
	 */
	private String printGuestArray() {
		String s = "";
		for (int i = 0; i < guestIndex; i++) {
			s += guestList[i] + "\n";
		}
		return s;
	}

	/**
	 * @return
	 */
	private String printStaffArray() {
		String s = "";
		for (int i = 0; i < staffIndex; i++) {
			s += staffList[i] + "\n";
		}
		return s;
	}

	public String toString() {
		return printStaffArray();
	}
}
