import java.util.ArrayList;

public class Student {


    private ArrayList<Integer> grades = new ArrayList<>();
    private long iD;
    private String name;

    public Student(long iD, String name) {
        this.iD = iD;
        this.name = name;
    }


    public long getiD() {
        return this.iD;
    }

    public String getName() {
        return this.name;
    }


    public void addGrade(int i) {
        this.grades.add(i);
    }

    public ArrayList getGrades(){
        return this.grades;
    }

    public static void main(String[] args) {
        Student test1 = new Student(1234567, "Gary Oak");

        test1.addGrade(90);
        test1.addGrade(45);
        test1.addGrade(60);

        System.out.println(test1.getGrades());
    }
}
