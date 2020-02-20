class Account
{
	private String name ;
	private int accountno ;
	private double amount ;
	
	Account ()
	{
		System.out.println("Default Account") ;
	}
	
	Account(String n, int an, double am)
	{
		System.out.println("Name:" +n) ;
		System.out.println("Account No:" +an) ;
		System.out.println("Amount:" +am) ;
	}
	
	public void setName(String n)
	{
		name = n ;
	}
	public void setAccountNo (int an)
	{
		accountno = an ;
	}
	public void setAmount (double am)
	{
		amount = am ;
	}
	
	public String getName()
	{
		return name ;
	}
	public int getAccountNo()
	{
		return accountno ;
	}
	public double getAmount()
	{
		return amount ;
	}
	
	public void display ()
	{
		System.out.println("Name:" +name) ;
		System.out.println("Account No:" +accountno) ;
		System.out.println("Amount:" +amount) ;
	}
	
	
}