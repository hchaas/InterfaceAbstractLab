package lab1;

public class IntroJavaCourse extends ProgrammingCourse{

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            throw new IllegalArgumentException("Invalid entry;");
        }
        else{
        this.setCredits(credits);
        }
    }

}
