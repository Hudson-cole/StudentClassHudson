public class TeacherHudson extends PersonHudson{
    String course;

    public TeacherHudson(String fName, String lName, String subject){
        super(fName, lName);
        course = subject;

    }

    public String toString(){
        return lastName + ", " + firstName + "\n  Subject: " + course;

    }

}
