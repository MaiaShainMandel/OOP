/**
 * The "VistualSchool" class for the CrazyObjects problem.
 * @author Maia Mandel 
 * @date 2019. 04. 23
 * @version 1
 */
public class VirtualSchool
{
    /**
     *  Demo test driver for the Crazy Objects problem
     */
    public static void main (String[] args)
    {   // Create a student and display
 Student me = new Student("Maia");
 System.out.println("Student: "+me+"\n"); 

 // Attempt to enter the classroom of Ms. Krasteva
 ClassRoom ics4u01 = new ClassRoom("ICS4U01", "Ms. Krasteva");
 if (ics4u01.enter(me) == true)
 {
     System.out.println(me+" was allowed into class.");
 }
 else
 {
     System.out.println(me+" was not allowed into class.");        
 }

 System.out.println();
 
 // Attempt to enter the classroom of Mr. Rosen
 ClassRoom ics4u02 = new ClassRoom("ICS4U02", "Mr. Rosen");
 if (ics4u02.enter(me) == true)
 {
     System.out.println(me+" was allowed into class.");
 }
 else
 {
     System.out.println(me+" was not allowed into class.");        
 }
 
    } // main method
} // VirtualSchool class
