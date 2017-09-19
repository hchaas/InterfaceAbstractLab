package lab1;

public abstract class ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public ProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Invalid value.");
        } else {
            this.courseName = courseName;
        }
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Invalid entry.");
        } else {
            this.courseNumber = courseNumber;
        }
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        else{
        this.credits = credits;
        }
    }
    
    public final String getPrerequisites(){
        return prerequisites;
    }
    
    /*this is not final because it needs to be overridden in the intro to programming class*/
    public void setPrerequisites(String prerequisites){
        if (prerequisites == null || prerequisites.isEmpty()){
            throw new IllegalArgumentException("Invalid entry; prerequisites cannot be blank.");
        }
        else{
            this.prerequisites = prerequisites;
        }
    }

}
