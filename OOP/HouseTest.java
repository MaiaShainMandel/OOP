// The "HouseTest" class.
import java.awt.*;
import hsa.Console;

public class HouseTest
{
    public static void main (String[] args)
    {
	House h1 = new House (297, "Maxwell", "Toronto", "ON", "M3H 5C2", 20.5, true, 3);
	h1.displayAddress();
	House h2 = new House (17, "Aldwinckle", "Toronto", "ON", "M3J 3S7", 23, false, 0);
	h2.displayAddress();
	House h3 = new House (16, "Purdon", "Toronto", "ON", "M3H 5J2", 22, false, 9);
	h3.displayAddress();
	House h4 = new House (297, "Bathurst", "Toronto", "ON", "M3H 5C2", 700, true, 43);
	h4.displayAddress();
	House h5 = new House (297, "Main", "Vancouver", "BC", "M3H 5C2", 9.5, true, 8);
	h5.displayAddress();
    } // main method
} // HouseTest class
