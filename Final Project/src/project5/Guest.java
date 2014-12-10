/**
 * 
 */
package project5;

/**
 * @author Margo Theobald <mtheobal@skidmore.edu>
 *
 */
public class Guest {
	/*
	 * Define instance variables
	 */
	private String name;
	private String email;
	private String hotel;
	private String arrival;
	private String departure;
	private String program;

	/**
	 * Create a constructor to make a guest object
	 */

	/**
	 * @param theName
	 * @param theEmail
	 * @param theHotel
	 * @param theArrival
	 * @param theDeparture
	 * @param theProgram
	 */
	public Guest(String theName, String theEmail, String theHotel,
			String theArrival, String theDeparture, String theProgram) {

		this.name = theName;
		this.email = theEmail;
		this.hotel = theHotel;
		this.arrival = theArrival;
		this.departure = theDeparture;
		this.program = theProgram;
	}

	/**
	 * the methods below define accessors for instance variables
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return
	 */
	public String getHotel() {
		return hotel;
	}

	/**
	 * @return
	 */
	public String getArrival() {
		return arrival;
	}

	/**
	 * @return
	 */
	public String getDeparture() {
		return departure;
	}

	/**
	 * @return
	 */
	public String getProgram() {
		return program;
	}
}
