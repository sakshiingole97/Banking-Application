package Project2;

public class Bank
{
    private int AccNo;
    private String holder,bName;
    private double Balance;

    public Bank(int accNo, String holder, String bName) {
        AccNo = accNo;
        this.holder = holder;
        this.bName = bName;

    }


    public int getAccNo()
    {
        return AccNo;
    }

    public void setAccNo(int AccNo)
    {
        this.AccNo = AccNo;
    }

    public String getHolder()
    {
        return holder;
    }

    public void setHolder(String holder)
    {
        this.holder = holder;
    }

    public String getbName()
    {
        return bName;
    }

    public void setbName(String bName)
    {
        this.bName = bName;
    }



    public double getBalance()
    {
        return Balance;
    }

    public void setBalance(double Balance)
    {
        this.Balance = Balance;
    }

    @Override
    public String toString()
    {
        return "Bank" +
                "\n holder='" + holder +
                "\nBalance=" + Balance ;

    }
}
