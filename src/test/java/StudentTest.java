import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class StudentTest {

    @Test
    public void checkStudentID(){
        Student test1 = new Student(1234567, "Gary Oak");
        Student test2 = new Student(7654321, "Mary Bloak");
        Student test3 = new Student(1111111, "Cherry Stroke");

        assertEquals(1234567,test1.getiD());
        assertEquals(7654321,test2.getiD());
        assertEquals(1111111,test3.getiD());

    }

    @Test
    public void checkStudentName(){
        Student test1 = new Student(1234567, "Gary Oak");
        Student test2 = new Student(7654321, "Mary Bloak");
        Student test3 = new Student(1111111, "Cherry Stroke");

        assertEquals("Gary Oak",test1.getName());
        assertEquals("Mary Bloak",test2.getName());
        assertEquals("Cherry Stroke",test3.getName());
    }


    @Test
    public void checkStudentGrade(){
        Student test1 = new Student(1234567, "Gary Oak");

        test1.addGrade(90);
        test1.addGrade(45);
        test1.addGrade(60);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(90);
        expected.add(45);
        expected.add(60);

        System.out.println(test1.getGrades());
        assertEquals(expected, test1.getGrades());
    }




}
