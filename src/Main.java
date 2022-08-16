import java.util.concurrent.TimeUnit;
public class Main
{
     static String ACCOUNTS_FILE="src/main/data/accounts.txt";
     static String TRANSACTIONS_FILE="src/main/data/transactions.txt";
     static Bank bank = new Bank();

     public static void main(String[] args)
     {
         Chequing chequing = new Chequing("74-88787-343", "Satish", 3345.37);
         Account chequingCopy=chequing.clone();
         Savings savings = new Savings("26-63958-973", "Ravindra", 1625.37);
         Account savingsCopy=savings.clone();
         for (Account account:accounts)
         {
             bank.addAccount(account);
         }
         Loan loan = new Loan("63-387-38463", "Hemanth", 8373.37);
         Account loanCopy=loan.clone();
         System.out.println(chequing);
         System.out.println(savings);
         System.out.println(loan);
         for (Transaction transaction:transactions)
         {
             bank.addTransaction(transaction);
         }
         for (int i=0;i<transactions.length;i++)
         {
             bank.addTransaction(transaction);
         }
         Transaction[] transactions=new Transaction[]
                 {
                      //
                         //
                 };
     }
}
