public class Loan extends Account
{
    private static final double INTREST_RATE=0.02;
    private static final double MAX_DEBIT=10000;
    public Loan(String id,String name,double balance)
    {
        super(id,name,balance);
    }
    public Loan(Loan source)
    {
        super(source);
    }
    @Override
    public void deposit(double amount)
    {
       super.setBalance(super.round(super.getBalance() - amount));
    }
    @Override
    public Account clone() {
        return new Loan(this);
    }

    @Override

    public boolean withdraw(double amount)
    {
        if(super.getBalance() + amount > MAX_DEBIT)
        {
            return false;
        }
        super.setBalance(super.round(super.getBalance() + amount + (amount * INTREST_RATE)));
        return true;
    }
}

