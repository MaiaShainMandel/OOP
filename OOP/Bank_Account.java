public class Bank_Account
{
  public long acct_num;
  private double balance;
  private String type;
  private float intrest_rate
    
    public Bank_Account (long acct, double bal, String ty, float interest)
  {
       acct_num = acct;
    balance = bal;
    type = ty;
    intrest_rate = intrest;
  }
    
  public double getBalance ()
  {
    return balance;
  }
  
    
  public String getType ()
  {
    return type;
  }
  
    
  public void deposit (double amt)
  {
    balance += amt;
  }
  
  public boolean withdrawl (double amt)
  {
    if (amt <= balance)
    {
      balance = balance - amt;
      return true;
    }
      else 
      {
        return false;
  }
  }
  
  public void applyInterst ()
  {
    balance = balence + (balance*interst)
  }
}