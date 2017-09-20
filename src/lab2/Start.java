
package lab2;

public class Start {
    public static void main(String[] args) {
            ProgrammingCourse [] myCourses = {
            new IntroToProgrammingCourse("Introduction to Programming", "43534"),
            new IntroJavaCourse("Introduction to Java Programming", "3433"),
            new AdvancedJavaCourse("Advanced Java Programming", "9895")
        };
        
        for (ProgrammingCourse myCourse : myCourses) {
            System.out.println(myCourse.getcourseName());
        }
    }
    
}
