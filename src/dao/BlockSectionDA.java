package dao;

import domain.*;
import java.io.*;
import java.util.*;
import java.lang.*;


public class BlockSectionDA
{
    private List<Integer> studentList = new ArrayList<>();

    public BlockSectionDA() throws FileNotFoundException
    {
        BlockSection blockSection = new BlockSection();
        Scanner blockSectionInfo = new Scanner(new FileReader("src/blockSection.csv"));


        String rowBlockSection = new String();
        rowBlockSection = blockSectionInfo.nextLine();


        String[] rowBlockSectionSpecific = new String[3];
        rowBlockSectionSpecific = rowBlockSection.split(",");


        blockSection.setBlockCode(rowBlockSectionSpecific[0]);
        blockSection.setDescription(rowBlockSectionSpecific[1]);
        blockSection.setAdviser(rowBlockSectionSpecific[2]);

        /* failed attempt of trying to add number of students

        List<Integer> list = studentList;
        studentList.add(studentList.get(2));
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);
        blockSection.setTotalStudents(sum);

        StudentDA studentDA = new StudentDA();
        blockSection.setStudentList(studentDA.getStudentList()); */



        String result = new String();
        result += "Block section code: " + blockSection.getBlockCode().toString() +
                "\n" + "Description: " + blockSection.getDescription().toString() +
                "\n" + "Adviser: " + blockSection.getAdviser().toString() +
                "\n\n" + "Total Students: " + blockSection.getTotalStudents() + "\n\n";

        for (Student student : blockSection.getStudentList())
        {
            result += "Student number: " + student.getStudentNumber().toString()
                    + "\n" + "Student name: " + student.getName().toString()
                    + "\n" + "Program: " + student.getProgram().toString()
                    + "\n" + "Total units enrolled: " + student.getTotalUnitsEnrolled()
                    + "\n\n";

            result += "Course code\t" + "Description\t\t"
                    + "Units\t\t" + "Day\t\t\t" + "Time\n\n";

            for(Course course: student.getCourseList())
            {
                result += course.getCourseCode().toString() + "\t"
                        + course.getDescription().toString() + "\t\t\t"
                        + course.getUnit() + "\t\t\t"
                        + course.getDay().toString() + "\t\t\t"
                        + course.getTime().toString() + "\n\n";

            }

        }

        System.out.println(result);

    }

         /*   failed attempt of trying to add number of students

         public void addStudent() throws FileNotFoundException
            {
            Scanner studentInfo = new Scanner(new FileReader("src/studentInfo.csv"));

            while (studentInfo.hasNext())
            {
                String rowStudent = new String();
                rowStudent = studentInfo.nextLine();

                //declare an array that will split the student
                String[] rowStudentSpecific = new String[4];
                rowStudentSpecific = rowStudent.split(",");

                Student student = new Student();
                student.setName(rowStudentSpecific[2]);


            }
            Scanner fileInput = new Scanner(student.)

            } */

}
