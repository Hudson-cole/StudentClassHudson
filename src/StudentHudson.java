import java.util.Scanner;

public class StudentHudson extends PersonHudson{
   private static int studentID;
    public int numStudent;
    public int level;

    // create student constructor use super to pul from person class
    public StudentHudson (String fName, String lName, int gLevel){

        // pull fName and lName from person class using super
        super(fName, lName);

        //pull grade level if the grade level falls outside of 0-12 return zero
        if (level > 0 && level <= 12) {
            this.level = gLevel;
        }

        else{
                level = 0;
            }
            // create student number, each student number will increase to the next unused positive int
            studentID = 0;
            numStudent = studentID ++;




    }

    // returns the students grade level
    public int getLevel() {
        return level;
    }

    public String toString(){
        return super.toString() + "\n Grade Level: " + getLevel() + "\nID: " + numStudent ;

    }

}
