// The "StudentTest" class.
import java.awt.*;
import hsa.Console;

public class StudentTest
{
    public static void main (String[] args)
    {
	Student s = new Student ("Fred");
	s.setMarks (40, 105);        
	s.calcAverage ();
	System.out.println (s.message ());
	Student s1 = new Student ("Larry");
	s1.setMarks (1, 6);        
	s1.calcAverage ();
	System.out.println (s1.message ());
	Student s2 = new Student ("John");
	s2.setMarks (40, 80);
	s2.calcAverage ();
	System.out.println (s2.message ());
	Student s3 = new Student ("Mark");
	s3.setMarks (90, 30);
	s3.calcAverage ();
	System.out.println (s3.message ());
	Student s4 = new Student ("Steve");
	s4.setMarks (20, 27);
	s4.calcAverage ();
	System.out.println (s4.message ());
    } // main method
} // StudentTest class
