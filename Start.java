class Start
{
	public static void main (String args [] )
	{
		SavingAccount s1 = new SavingAccount () ;
	
		s1.setName("Shihab") ;
		s1.setAccountNo (987654321) ;
		s1.setAmount (256987.2565) ;
		s1.setInterest (5) ;
		s1.setNoOfYear (10) ;
		
		s1.display2() ;
		s1.interestAmountCal() ;
		
		
	}
}