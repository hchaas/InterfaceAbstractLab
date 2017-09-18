
package lab1;

public class Start {
    public static void main(String[] args) {
        
        ProgrammingCourse [] courses = {
            new IntroToProgrammingCourse("Introduction to Programming", "43534"),
            new IntroJavaCourse("Introduction to Java Programming", "3433"),
            new AdvancedJavaCourse("Advanced Java Programming", "9895")
        };
        
        for (int i =0; i <courses.length; i++){
            System.out.println(courses[i].getCourseName());
        }
    }

}