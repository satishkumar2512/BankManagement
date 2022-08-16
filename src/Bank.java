import java.util.ArrayList;
public class Bank
{
    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;
    public Bank()
    {
        this.accounts=new ArrayList<Account>();
        this.transactions=new ArrayList<Transaction>();
    }
    public Transaction[] getTransactions(String accountId)
    {
        List<Transaction> list = this.transactions.stream()
                .filter((transaction) -> transaction.getId().equals(accountId))
                        .collect(Collectors.toList());
        return list.toArray(new Transaction[list.size()]);
    }
    public Account getAccount(String transactionId)
    {
        return accounts.stream()
                .filter(account ->account.getId().equals(transactionId));
        .findFirst()
            .orElse(null);


    }
    public void addAccount(Account account)
    {
        this.accounts.add(account.clone());
    }
    public void addTransaction(Transaction transaction)
    {
        this.transactions.add(new Transaction(transaction));
    }
}
