/**
 * 
 */
package project5;

/**
 * @author Margo Theobald <mtheobal@skidmore.edu>
 *
 */
public class Staff {
	private String name;
	private Guest[] guestList;
	private int guestIndex;
	private String program;

	/**
	 * @param staffName
	 * @param program
	 */
	public Staff(String staffName, String program) {
		this.setName(staffName);
		this.program = program;
		this.guestList = new Guest[10];
		guestIndex = 0;
	}

	/**
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
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getProgram() {
		return this.program;
	}

	/**
	 * @return
	 */
	private String printGuestList() {
		String s = "";
		for (int i = 0; i < guestIndex; i++) {
			String g = guestList[i].getName() + "\t          "
					+ guestList[i].getEmail() + "\t " + guestList[i].getHotel()
					+ "\t" + guestList[i].getArrival() + "\t"
					+ guestList[i].getDeparture() + "\n";
			s += g;
		}
		return s;
	}

	public String toString() {
		return "Staff assigned: " + name + "\n" + "Program: " + program + "\n"
				+ printGuestList();
	}
}
