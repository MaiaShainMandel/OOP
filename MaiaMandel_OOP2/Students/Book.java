/**
 * The "Book" class for the CrazyObjects problem.
 * @author Maia Mandel 
 * @date 2019. 04. 23
 * @version 1
 */

public class Book
{
    String title;
    String course;

    public Book()
    {
    }

    public void setTitle(String thisTitle)
    {
      title = thisTitle;
    }

    public void setCourse(String thisCourse)
    {
      course = thisCourse;
    }
    
    public String toString()
    {   
      System.out.println (title + " for " + course);
      return toString();
    }
    
} // Book class