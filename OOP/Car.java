//the "Car" class
public class Car
{

    private String brand; //attribute variables
    private String model;
    private int kilometres;
    private double gas;
    private double tankCapacity;

    public Car (String b, String m, double g, double tCap)
    {

	brand = b;
	model = m;
	kilometres = 0;
	gas = g;
	tankCapacity = tCap;
    }


    public void drive (double distance)  //drive instance method
    {

	kilometres += distance;
	gas -= distance / 5;
    }


    public void gasUp ()  //get gas instance method
    {
	gas = tankCapacity;
    }
} // Car class


