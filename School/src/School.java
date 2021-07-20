public class School implements SchoolDetails {
    protected String name;
    protected int numOfStudents;
    protected int numOfClasses;
    protected String [] students;
    public School(String name)
{
    this.name=name;
    this.numOfStudents=0;
    this.numOfClasses=0;
}

    @Override
    public double getNumberOfStudents() {
        return this.numOfStudents;
    }
    @Override
    public String getStudentDetails(int num) {
return null;
    }

    @Override
    public String getDetailsOfClassroom(int num) {
        return null;
    }

    @Override
    public void addStudent(String a) {

    }

public static void main(String [] args) {
System.out.println("hello");

}




}
