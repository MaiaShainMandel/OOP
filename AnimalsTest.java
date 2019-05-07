// The "AnimalsTest" class.
import java.awt.*;
import hsa.Console;

public class AnimalsTest
{
    public static void main (String[] args)
    {
	Animal a1 = new Animal ("Monkey", 20.5);
	a1.feed ("carrot");
	a1.sleep ();
	Animal a2 = new Animal ("Dog", 87.1);
	a1.feed ("lettuce");
	a1.sleep ();
	Animal a3 = new Animal ("Sheep", 55.6);
	a3.feed ("burger");
	a3.sleep ();
	Animal a4 = new Animal ("Donkey", 37.8);
	a4.feed ("cabbage");
	a4.sleep ();
	Animal a5 = new Animal ("Bird", 45);
	a5.feed ("chips");
	a5.sleep ();
    } // main method
} // AnimalsTest class
