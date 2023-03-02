package dao;

import domain.Course;

import java.io.*;
import java.util.*;

public class CourseDA {

    private List<Course> courseList = new ArrayList<Course>();
    public CourseDA(String studentNumber) throws FileNotFoundException {

        Scanner scheduleInfo = new Scanner(new FileReader("src/scheduleInfo.csv"));

        while (scheduleInfo.hasNext())
        {
            String rowCourse = new String();
            rowCourse = scheduleInfo.nextLine();

            String[] rowCourseSpecific = new String[6];
            rowCourseSpecific = rowCourse.split(",");

            if(studentNumber.equals(rowCourseSpecific[0].trim()));
            Course course = new Course();
            course.setCourseCode(rowCourseSpecific[1]);
            course.setDescription(rowCourseSpecific[2]);
            course.setUnit(Integer.parseInt(rowCourseSpecific[3].trim()));
            course.setDay(rowCourseSpecific[4]);
            course.setTime(rowCourseSpecific[5]);



            courseList.add(course);

        }

    }
    public List<Course> getCourseList() {
        return courseList;
    }
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
