class Account
	{
		String name;
		protected double balance;
		Account(String str, double amt)	
	{
		name=str;
		balance=amt;
	}
		String getName()
		{
			return name;
		}
		double getBalance()
		{
			return balance;
		}
		void deposit(double amt)
		{
			balance+=amt;
			System.out.println("Depositing: " +amt);
		}
	void withdraw(double amt)
	{
		balance -=amt;
		System.out.println("withdrawing:" +amt);
	}
	}
	class SavingsAccount extends Account
	{
		double interestRate;
		SavingsAccount(String str,double amt,double rate)
		{
			super(str,amt);
			interestRate=rate;
		}
	}
		class CheckingAccount extends Account{
		double overDraft;
		CheckingAccount(String str, double amt)
	{
		super(str,amt);
	}
	CheckingAccount(String str, double amt,double draft)
	{
		super(str,amt);
		overDraft=draft;
	}
	void withdraw(double amt)
	{
		System.out.println("overDraft Amount:" +overDraft);
		if(amt<=balance)
		{
			balance -=amt;
			System.out.println("withdrawing:"+amt);
		}
		else if((amt>balance)&&(amt>(balance+overDraft)))
		{
			System.out.println("sorry! you can not withdraw");
		}
		else
	{
		double result=amt-balance;
		overDraft-=result;
		balance=0;
		System.out.println("withdraw:" +amt);
		System.out.println("current overDraft amount:"+overDraft);
	}
	}
	}
	class AccountTest
	{
		public static void main(String[] args)
		{
			SavingsAccount sAccountObj=new SavingsAccount("john",500,4);
			System.out.println("\n Savings account details");
			System.out.println("------------");
			System.out.println("" +sAccountObj.getName()+"has an initial Balance of:" +sAccountObj.getBalance());
			sAccountObj.deposit(200);
			sAccountObj.withdraw(200);
			System.out.println(""+sAccountObj.getName() +"at the end of transaction has a balance of:" +sAccountObj.getBalance());
			System.out.println("\n checking account details");
			System.out.println("---------");
			CheckingAccount cAccountObj=new CheckingAccount("sanchita",200,200);
			System.out.println(""+cAccountObj.getName()+"has an initial balance of:" +cAccountObj.getBalance());
			cAccountObj.deposit(200);
			cAccountObj.withdraw(500);
			System.out.println(""+cAccountObj.getName() +"at the end of the transaction has balance of:"+cAccountObj.getBalance());
		}
	}

