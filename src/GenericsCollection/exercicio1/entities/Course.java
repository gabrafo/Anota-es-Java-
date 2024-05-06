package GenericsCollection.exercicio1.entities;

import java.util.Objects;

public class Course {
    private int studentsID;
    private String courseName;


    public Course(int studentsID, String courseName) {
        this.studentsID = studentsID;
        this.courseName = courseName;
    }

    public int getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(int studentsID) {
        this.studentsID = studentsID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return studentsID == course.studentsID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentsID);
    }
}
