package lab2;

public class AdvancedJavaCourse extends ProgrammingCourse{

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber){
        super(courseName, courseNumber);
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Invalid entry; prerequisites cannot be blank.");
        }
        else{
        this.prerequisites = prerequisites;
        }
    }

    
}
