// The "CarTest" class.
import java.awt.*;
import hsa.Console;

public class CarTest
{
    public static void main (String[] args)
    {
	Car c = new Car ("Honda", "Civic", 12, 10.3);
	c.drive(7);        
	c.gasUp();
	Car c1 = new Car ("Jeep", "Ranger", 1, 12);
	c1.drive(6);        
	c1.gasUp();
	Car c2 = new Car ("Mercedez", "Bendz", 11, 0.3);
	c2.drive(100);        
	c2.gasUp();
	Car c3 = new Car ("Porch", "911", 12, 111.3);
	c3.drive(17);        
	c3.gasUp();
	Car c4 = new Car ("Mazda", "CX5", 182, 508);
	c4.drive(12);        
	c4.gasUp();
    } // main method
} // CarTest class
