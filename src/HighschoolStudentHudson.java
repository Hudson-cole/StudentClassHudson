public class HighschoolStudentHudson extends StudentHudson {
    private double gradePointAvg;

    public HighschoolStudentHudson(String fName, String lName, int gLevel, double gpa){
       // pull values from superclasses
        super(fName, lName, gLevel);

        // if grade point average is between 1 & 5 then use that value or gpa otherwise gpa defaults to 0
        if (gradePointAvg > 5 || gradePointAvg < 1){
            gradePointAvg = 0;
        }
        else{
            this.gradePointAvg = gpa;
        }

    }
    public String toString(){
        return super.toString() + "\n GPA: " + gradePointAvg;

    }

}
