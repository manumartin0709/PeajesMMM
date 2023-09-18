package tiketsTypes;


public class TicketEspecial extends Ticket 
{
	/**
	 * Number of passengers in the bus
	 * 
	 */
	private int numbersPasengers;
	
	/**
	 * Constructor
	 * @param kmOut
	 * @param numbersPasengers
	 */
	public TicketEspecial(int kmOut, int numbersPasengers) {
		super(kmOut);
		this.numbersPasengers = numbersPasengers;
	}
	
	//getters and setters
	
	/**
	 * Get the number of pasengers
	 * @return
	 */

	public int getNumbersPasengers() {
		return numbersPasengers;
	}
	
	/**
	 * Setter the number of passengers
	 * @param numbersPasengers
	 */

	public void setNumbersPasengers(int numbersPasengers) {
		this.numbersPasengers = numbersPasengers;
	}

	/**
	 * Method to string
	 */
	@Override
	public String toString() {
		return "TicketEspecial [numbersPasengers=" + numbersPasengers + "]";
	}

	@Override
	public void amountOut (int kmOut) 
	{
		amountOut(kmOut);	
	}

}
