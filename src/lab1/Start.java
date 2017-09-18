
package lab1;

public class Start {
    public static void main(String[] args) {
        /*Using the Liskov principle makes sense to me when you're creating a list of objects
        to do the same thing, assuming that thing is an ability/method of the superclass
        */
        ProgrammingCourse [] courses = {
            new IntroToProgrammingCourse("Introduction to Programming", "43534"),
            new IntroJavaCourse("Introduction to Java Programming", "3433"),
            new AdvancedJavaCourse("Advanced Java Programming", "9895")
        };
        
        for (ProgrammingCourse course : courses) {
            System.out.println(course.getCourseName());
        }
    }

}