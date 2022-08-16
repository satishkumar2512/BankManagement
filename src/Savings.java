public class Savings extends Account
{
    private static final double WITHDRAW_FEE=5.0;
    public Savings(String id,String name,double balance)
    {
        super(id,name,balance);
    }
    public Savings(Savings source)
    {
        super(source);
    }

    @Override
    public Account clone() {
        return new Savings(this);
    }

    @Override
    public void deposit(double amount)
    {
        super.setBalance(super.round(super.getBalance()+amount));
    }

    @Override
    public boolean withdraw(double amount)
    {
            super.setBalance(super.round(super.getBalance() - amount - WITHDRAW_FEE));
            return true;
    }
}
