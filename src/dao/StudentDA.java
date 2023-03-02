package dao;

import domain.*;
import java.io.*;
import java.util.*;


public class StudentDA
{
    private List<Student> studentList = new ArrayList<Student>();

    public StudentDA() throws FileNotFoundException
    {
        Scanner studentInfo = new Scanner(new FileReader("src/studentInfo.csv"));

        while (studentInfo.hasNext())
        {


            String rowStudent = new String();
            rowStudent = studentInfo.nextLine();


            String[] rowStudentSpecific = new String[4];
            rowStudentSpecific = rowStudent.split(",");

            Student student = new Student();
            student.setStudentNumber(rowStudentSpecific[1]);
            student.setName(rowStudentSpecific[2]);
            student.setProgram(rowStudentSpecific[3]);

            CourseDA courseDA = new CourseDA(student.getStudentNumber().trim());
            student.setCourseList(courseDA.getCourseList());
            studentList.add(student);




        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
