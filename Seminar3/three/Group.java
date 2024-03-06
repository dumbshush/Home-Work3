package Seminar3.three;
import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Iterable<Student> {
    ArrayList<Student> students;

    public Group(ArrayList<Student> students){
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(students);
    }
}
