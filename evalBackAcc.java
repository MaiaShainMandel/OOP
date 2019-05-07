public class evalBackAcc
{
  public static void main (String [] args)
  {
    Bank_Account b1 = new Bank_Account (456, 45.8, "Checkings", 0.1f);
      System.out.println (b1.getType + "; " + b1.getBalance)
        b1.deposit (43);
        b1.withdrawl (12);
        b1.applyInterest ();
        System.out.println ("New Balance " + b1.getBalance);
      
    Bank_Account b2 = new Bank_Account (2009, 62.3, "Savings", 0.4f);
      System.out.println (b2.getType + "; " + b2.getBalance)
        b2.deposit (8);
        b2.withdrawl (6);
        b2.applyInterest ();
        System.out.println ("New Balance " + b2.getBalance);    
    
        Car c = new Car ("Honda", "Civic", 45.5, 90);
        c.drive (900.8);
          c.gasUp ();
     Car c1 = new Car ("Jeep", "Cherocke", 90.5, 100);
        c1.drive (200.8);
          c1.gasUp ();
  }
   
}