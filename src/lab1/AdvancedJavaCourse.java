package lab1;

public class AdvancedJavaCourse extends ProgrammingCourse {

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Invalid entry.");
        } else {
            this.prerequisites = prerequisites;
        }
    }
}
