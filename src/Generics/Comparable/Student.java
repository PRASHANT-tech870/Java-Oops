package Generics.Comparable;

public class Student implements Comparable<Student> {

    @Override
    public String toString() {
        return "rollno=" + rollno + " and marks=" + marks ;

    }

    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;

    }
}
