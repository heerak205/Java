/**
 * {imports all the utilities}.
 */
import java.util.*;
/**
 * Class for student.
 */
public class Student{
    String name;
    String rollno;
    float sub1;
    float sub2;
    float sub3;
    float gpa;
    /**
     * Constructs the object.
     *
     * @param      name    The name
     * @param      rollno  The rollno
     * @param      sub1    The sub 1
     * @param      sub2    The sub 2
     * @param      sub3    The sub 3
     */
    Student(String name, String rollno, float sub1, float sub2, float sub3 ){
        this.name = name;
        this.rollno = rollno;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    /**
     * { function to calculate gpa}.
     *
     * @param      sub1  The sub 1
     * @param      sub2  The sub 2
     * @param      sub3  The sub 3
     *
     * @return     { description_of_the_return_value }
     */
    public float calgpa(float sub1, float sub2, float sub3){
        this.gpa = (sub1 + sub2 + sub3)/3;
        return gpa;
    }
    /**
     * {main function}.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Sanjay", "IT201985001", 7.5f, 7.0f, 8.0f);
        float cgpa;
        cgpa = s1.calgpa(s1.sub1, s1.sub2, s1.sub3);
        System.out.println(cgpa);
        Student s2 = new Student("Bidhya", "IT201985003", 8.5f, 6.0f, 7.5f);
        cgpa = s2.calgpa(s2.sub1, s2.sub2, s2.sub3);
        System.out.println(cgpa);
        Student s3 = new Student("Kelzang", "IT201985065", 7.5f, 8.0f, 9.0f);
        cgpa = s3.calgpa(s3.sub1, s3.sub2, s3.sub3);
        System.out.println(cgpa);
    }

}
