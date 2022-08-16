import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
public class Transaction
{
    public enum Type {WITHDRAW,DEPOSIT};
    private Type type;
    private long timestamp;
    private String id;
    private double amount;
    public Transaction(Type type,long timestamp,String id,double amount)
    {
        if(id == null || id.isBlank() || amount<0)
        {
            throw new IllegalArgumentException(("INVALID PARAMS"));
        }
        this.type=type;
        this.timestamp=timestamp;
        this.id=id;
        this.amount=amount;
    }
    public Transaction(Transaction source)
    {
        this.type=source.type;
        this.timestamp=source.timestamp;
        this.id=source.id;
        this.amount=source.amount;
    }
    public Type getType()
    {
        return this.type;
    }
    public void setType(Type type)
    {
        this.type=type;
    }
    public long getTimestamp()
    {
        return this.timestamp;
    }
    public void setTimestamp(long timestamp)
    {
        this.timestamp=timestamp;
    }
    public String getId()
    {
        return this.id;
    }
    public void setId(String id)
    {
        if(id == null || id.isBlank())
        {
            throw new IllegalArgumentException(("INVALID PARAMS"));
        }
        this.id=id;
    }
    public double getAmount()
    {
        return this.amount;
    }
    public void setAmount(double amount)
    {
        if(amount < 0)
        {
            throw new IllegalArgumentException(("INVALID AMOUNT"));
        }
        this.amount=amount;
    }
    public String returnDate()
    {
        Date date=new Date(this.timestamp * 1000);
        return new SimpleDateFormat("DD-MM-YYYY").format(date);
    }


    public int hashCode()
    {
        return Objects.hash(type,timestamp,id,amount);
    }

    @Override
    public String toString()
    {
        return (type)+"   "+
                "\t"+this.returnDate() +" "+
                "\t"+id +" "+
                "\t$"+amount+" ";
    }
}