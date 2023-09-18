package tiketsTypes;

import interfaces.ITicket;

public abstract class Ticket implements ITicket
{

	/**
	 * km when the car enter in the highway
	 */
    private int kmEntry;
    
    /**
     * km when the car go out of the highway
     */
    private int kmOut;
    /**
     * price to be impressed int the ticket
     */
    private double priceToPay;
    
    /**
     * Constructor
     * @param kmSalida
     */
    protected Ticket(int kmOut)
    {

        this.kmEntry = kmEntry;
        this.kmOut = kmOut;
        this.priceToPay = priceToPay;

    }

    //getters and setters
    
    /**
     * 
     * @return
     */
	public int getKmEntry() 
	{
		return kmEntry;
	}
	
	/**
	 * 
	 * @param kmEntry
	 */

	public void setKmEntry(int kmEntry) 
	{
		this.kmEntry = kmEntry;
	}
	
	/**
	 * 
	 * @return
	 */

	public int getKmOut() 
	{
		return kmOut;
	}
	
	/**
	 * 
	 * @param kmOut
	 */

	public void setKmOut(int kmOut) 
	{
		this.kmOut = kmOut;
	}
	
	/**
	 * 
	 * @return
	 */

	public double getPriceToPay() 
	{
		return priceToPay;
	}

	/**
	 * 
	 * @param priceToPay
	 */
	public void setPriceToPay(double priceToPay) 
	{
		this.priceToPay = priceToPay;
	}
	
	/**
	 * @method to string
	 */

	@Override
	public String toString() 
	{
		return "Ticket [kmEntry=" + kmEntry + ", kmOut=" + kmOut + ", priceToPay=" + priceToPay + "]";
	}
     

	@Override
	public void amountOut (int kmOut) 
	{
		amountOut(kmOut);
		
	}
	
	
}
