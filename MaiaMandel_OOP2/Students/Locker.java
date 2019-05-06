/**
 * The "Locker" class for the CrazyObjects problem.
 * @author Maia Mandel 
 * @date 2019. 04. 23
 * @version 1
 */

public class Locker
{
    int number;
    Student owner;
    private Jacket studentJacket;
    private Book books[];
    
    /**
     * Default constructor
     */
    public Locker(Student me)
    {
        owner = me;
        books = new Book [4];
        number = (int)((Math.random()*1000)+1);
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

    public Jacket getJacket()
    {
        return studentJacket;
    }

    
    public boolean checkJacket()
    {
        return studentJacket!=null;
    }

    public void putJacket(Jacket myJacket)
    {
        studentJacket = myJacket;
    }
    
    public void assignOwner(Student me)
    {
        owner = me;
    }
    
    public String toString()
    {
        return "Locker #"+number+" belongs to "+owner;
    }
    
} // Locker class