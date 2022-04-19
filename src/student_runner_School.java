/*
 * School Classes
 * Use this runner to test your solutions to School Classes.
 */

import java.io.IOException;
import java.util.ArrayList;

public class student_runner_School {

    public static void main(String arg[]) throws IOException {

        PersonHudson p = new PersonHudson("John", "Doe");
        System.out.println("Printing person:\n");
        System.out.println(p);

        StudentHudson s = new StudentHudson("Sallie", "Smithers", 7);
        System.out.println("\nPrinting student:\n");
        System.out.println(s);

        System.out.println("\nPrinting highschoolstudent:\n");
        HighschoolStudentHudson h = new HighschoolStudentHudson("Bert", "Smith", 11, 3.67);
        System.out.println(h);

        ArrayList<StudentHudson> stu = new ArrayList<StudentHudson>();
        stu.add(new HighschoolStudentHudson("Jem", "Finch", 11, 3.4));
        stu.add(new StudentHudson("Scout", "Finch", 4));
        stu.add(new HighschoolStudentHudson("Natalie", "Adams", 11, 2.4));
        stu.add(new HighschoolStudentHudson("Boo", "Radley", 12, 1.7));
        stu.add(new HighschoolStudentHudson("Atticus", "Finch", 12, 4.8));
        stu.add(new StudentHudson("Elaine", "Benes", 9));
        stu.add(new StudentHudson("Patrick", "Henry", 11));

        ArrayList<TeacherHudson> tea = new ArrayList<TeacherHudson>();
        tea.add(new TeacherHudson("Ada", "Lovelace", "Mathematics"));
        tea.add(new TeacherHudson("Albert", "Einstein", "Physics"));
        tea.add(new TeacherHudson("Grace", "Hopper", "Computer Science"));
        tea.add(new TeacherHudson("Alan", "Turing", "Mathematics"));
        tea.add(new TeacherHudson("Marie", "Curie", "Chemistry"));
        tea.add(new TeacherHudson("Dolly", "Madison", "Government"));
        tea.add(new TeacherHudson("Maya", "Angelou", "English Composition"));

        SchoolHudson sch = new SchoolHudson(stu, tea);
        System.out.println("\nPrinting school: \n");
        System.out.println(sch);

        System.out.println("\nJust seniors: \n" + sch.getGradeLevel(12));

    }
}
