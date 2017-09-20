package lab2;

public class IntroJavaCourse implements ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public IntroJavaCourse(String courseName, String courseNumber){
        this.setcourseName(courseName);
        this.setcourseNumber(courseNumber);
    }

    @Override
    public final String getcourseName() {
        return courseName;
    }

    @Override
    public final void setcourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Invalid entry; course name cannot be blank.");
        } else {
            this.courseName = courseName;
        }
    }

    @Override
    public final String getcourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setcourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Invalid entry; course number cannot be blank");
        } else {
            this.courseNumber = courseNumber;
        }
    }

    @Override
    public final double getCredits() {
        return credits;
    }

    @Override
    public final void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Credits must be between 0.5 and 4.");
        } else {
            this.credits = credits;
        }
    }

    @Override
    public final String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Invalid entry; prerequisites cannot be blank.");
        } else {
            this.prerequisites = prerequisites;
        }
    }
    
}
