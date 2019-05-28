package com.karan;

import javax.print.attribute.DateTimeSyntax;
import java.time.DateTimeException;
import java.time.Year;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class StudentResult {
    public static void main(String[] args) {
        Student s1 = new Student();
        //System.out.println(s1.toString());
        s1.setStudentid(1);
        s1.calculateTotal();
        s1.setFirstName("KARAN");
        s1.setLastName("singh");
        s1.setGender("male");

        float myMarks[] = {70.0f,80.0f,90.0f,56.0f,78.5f};
        s1.setMarks(myMarks);

        //Array of 5 students
        Student studentArray[]= new Student[5];// Create 5 references of student class

        // studentArray[0] = new Student();
        studentArray[0] = s1;
        studentArray[1] = s1;
        studentArray[2] = s1;
        studentArray[3] = s1;
        studentArray[4] = s1;
         for(Student s  : studentArray)
         {
             s.calculateTotal();
             s.calculatePercentage();
             s.calculateResult();
             s.displayStudentInfo();
         }
    }
}
