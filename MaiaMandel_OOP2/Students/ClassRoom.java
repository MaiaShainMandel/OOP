/**
 * The "ClassRoom" class for the CrazyObjects problem.
 * @author Maia Mandel 
 * @date 2019. 04. 23
 * @version 1
 */

public class ClassRoom {
    private String course;
    private String teacher;

    public ClassRoom(String subject, String teacherName) {
        course = subject;
        teacher = teacherName;
    }

    public boolean enter(Student stu) {
        if (stu.myLocker == null) {
            stu.sentToOffice("Does not have a locker.");
            return false;
        }
        if (stu.myJacket != null) {
            stu.myLocker.putJacket(stu.myJacket);
            return false;
        }
        boolean hasBooks = false;
        for (int i = 0; i < stu.books.length; i++) {
            if (stu.books[i].course.equals(this.course))
                hasBooks = true;
        }
        if (!hasBooks) {
            stu.sentToOffice("Did not have the right books.");
            return false;
        }
        System.out.println(stu + " entered " + course + " class taught by " + teacher);
        return true;
    }
}