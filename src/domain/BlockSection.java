package domain;

import java.util.*;

public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private int totalStudents;
    private List<Student> studentList;


    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdviser() {
        return adviser;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

}
