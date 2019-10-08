import org.junit.Test;
import static org.junit.Assert.*;
public class CohortTest {

    @Test
    public void checkCohort(){
        Cohort cohort = new Cohort();
        Student student = new Student(1, "Greg");
        student.addGrade(90);
        student.addGrade(60);
        student.addGrade(80);
        Student student1 = new Student(2, "Beth");
        student1.addGrade(50);
        student1.addGrade(70);
        student1.addGrade(60);

        cohort.addStudent(student);
        cohort.addStudent(student1);

        assertEquals("Greg", cohort.getStudents().get(0).getName());
        assertEquals(68.33, cohort.getCohortAverage(),2);





    }
}
