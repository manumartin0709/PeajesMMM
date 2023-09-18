package tiketsTypes;

public class TicketGeneral extends Ticket 
{
	
	/**
	 * discount for the general ticket witch is 0.05
	 */
	private double discount;
	
	/**
	 * Constructor
	 * @param kmOut
	 */
	protected TicketGeneral(int kmOut) 
	{
		super( kmOut);
		this.discount = discount; 
	}
	
	//getters and setters
	
	/**
	 * 
	 * @return
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * 
	 * @param discount
	 */

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
	@Override
	public void amountOut(int kmOut) 
	{
		amountOut(kmOut);	
		
	}

	/**
	 * Method to string
	 */
	
	@Override
	public String toString() {
		return "TicketGeneral []";
	}

}
