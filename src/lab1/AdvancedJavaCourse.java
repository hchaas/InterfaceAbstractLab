package lab1;

import javax.swing.JOptionPane;


public class AdvancedJavaCourse extends ProgrammingCourse{
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber){
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Invalid entry.");
        }
        else{
        this.prerequisites = prerequisites;
        }
    }
    
    public double getCredits(){
        return credits;
    }
    
        public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Invalid entry.");
        }
        else{
        this.setCredits(credits);
        }
    }
}
