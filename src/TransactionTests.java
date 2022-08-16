public class TransactionTests
{
    Transaction transaction;

    public void setup()
    {
        transaction=new Transaction(Transaction.Type.WITHDRAW,1546905672,"87623-37-3878632",642.99);
    }
    public void correctDataTest()
    {
        assertEquals(07-01-2019,transaction.returnDate());
    }
}
