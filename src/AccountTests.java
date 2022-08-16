public class AccountTests
{c
    Account[] accounts;
    public void setup()
    {
        new Chequing("673-8374-3773","Satish",7636);
        new Savings("100-0274-0095","sharma",5232);
        new Loan("211-6262-8732","Saketh",1033);
    }
    public void withdrawal()
    {
        accounts[0].withdraw(1440);
        assertEquals(84.72,accounts[0].getBalance());
    }
    public void overdraft()
    {
        accounts[0].withdraw(1543.34);
        assertEquals(-15.43,accounts[0].getBalance());
    }
    public void overdraftLimit()
    {
        accounts[0].withdraw(1726);
        assertEquals(1524.43,accounts[0].getBalance());
    }
    public void withdrawalFee()
    {
        accounts[1].withdraw(100);
        assertEquals(2136.60,accounts[1].getBalance());
    }
    public void withdrawalIntrest()
    {
        accounts[2].withdraw(2434.31);
        assertEquals(5020.31,accounts[2].getBalance());
    }
    public void withdrawalLimit()
    {
        accounts[2].withdraw(7463.69);
        assertEquals(2537.31,accounts[2].getBalance());
    }
    public void deposit()
    {
        accounts[0].deposit(5000);
        assertEquals(6524.51,accounts[0].getBalance());
    }
    public void loanDeposit()
    {
        accounts[2].deposit(1000);
        assertEquals(1537.31,accounts[2].getBalance());
    }
    public void incomeTax()
    {
        double income=4000;
        accounts[0].deposit(income);
        ((Taxable)accounts[0]).tax(income);
        assertEquals(5374.51,accounts[0].getBalance());
    }
}
