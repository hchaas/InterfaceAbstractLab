package lab1;

import javax.swing.JOptionPane;

public abstract class ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;

    public ProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Invalid value.");
        } else {
            this.courseName = courseName;
        }
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Invalid entry.");
        } else {
            this.courseNumber = courseNumber;
        }
    }

    public abstract double getCredits();
    public abstract void setCredits();

    
    
}
