class SavingAccount extends Account 
{
	private int interest ;
	private int noofyear ;
	
	SavingAccount ()
	{
		System.out.println("Default SavingAccount") ;
	}
	SavingAccount (int in, int ny)
	{
		System.out.println("Interest:" +in) ;
		System.out.println("No Of Year:" +ny) ;
	}
	
	public void setInterest(int in)
	{
		interest = in ;
	}
	public void setNoOfYear (int ny)
	{
		noofyear = ny ;
	}
	
	
	public int getInterest()
	{
		return interest ;
	}
	public int getNoOfYear()
	{
		return noofyear ;
	}
	
	
	public void interestAmountCal ()
	{
		double totalinterest = getInterest() * getAmount() * getNoOfYear() ;
		double a = totalinterest/100 ;
		
		System.out.println ("Total Interest: " +a) ;
	}
	
	public void display2 ()
	{
		display() ;
		System.out.println("Interest:" +interest) ;
		System.out.println("No Of Year:" +noofyear) ;
	}
}