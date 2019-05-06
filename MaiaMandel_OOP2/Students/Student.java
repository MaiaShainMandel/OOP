/**
 * The "Student" class for the CrazyObjects problem.
 * @author Maia Mandel 
 * @date 2019. 04. 23
 * @version 1
 */
public class Student
{
    String number;
    String name;
    Locker myLocker;
    Jacket myJacket;
    Book books[];
    
    /**
     * Constructor
     * @param String myName - name of the student
     */
    public Student(String myName)
    {
      books = new Book[4];
      name = myName;
      myLocker = new Locker(this);
      myJacket = new Jacket(this);
      books[0] = new Book();
      books[0].setTitle("Nelson");
      books[0].setCourse("Math");
      books[1] = new Book();
      books[1].setTitle("Perspectives");
      books[1].setCourse("Science");
      books[2] = new Book();
      books[2].setCourse("Canadian History");
      books[2].setTitle("History");
      books[3] = new Book();
      books[3].setTitle("Barron's");
      books[3].setCourse("ICS");
    }

    /**
     * This method gets called when the student is sent to the office
     */
    public void sentToOffice(String reason)
    {
      System.out.println ("The student was sent to the office because " + reason);
    }

    /** 
     * Display student information
     */
     public String toString()
     {
      return name;
     }
    
} // Student class