import org.junit.Test;
import static org.junit.Assert.*;
public class CohortTest {

    @Test
    public void checkCohort(){
        Cohort cohort = new Cohort();
        Student student = new Student(1, "Greg");

        cohort.addStudent(student);

        assertEquals("Greg", cohort.getStudents().get(0).getName());



    }
}
