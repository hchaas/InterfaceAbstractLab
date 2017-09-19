package lab1;

public class IntroToProgrammingCourse extends ProgrammingCourse{
    
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }
    
    @Override
    public final void setPrerequisites(String prerequisites){
        prerequisites = "none";
    }
    
}
