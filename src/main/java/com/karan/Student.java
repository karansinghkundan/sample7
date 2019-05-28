package com.karan;




import java.util.Arrays;
import java.util.Date;

public class Student {
  private   int studentid;
   private String firstName;
  private   String lastName;
    private String gender;
     private Date birthDate;
    private float marks[];
    private float total;
    private float percentage;
    private String result;

    public Student() {
    }

    public Student(int studentid, String firstName, String lastName, String gender, Date birthDate, float[] marks) {
        this.studentid = studentid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.marks = marks;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
public void calculateTotal()
{
    this.total=0.0f;
    for (int i =0 ; i<marks.length;i++)
        this.total = this.total+ marks[i];
    }
    public void calculatePercentage()
    {
        this.percentage = this.total / this.marks.length;
}
public void calculateResult() {
    if (percentage >= 50)
        System.out.println("pass");
    else
        System.out.println("Fail");


}

public void displayStudentInfo()
{

}

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", marks=" + Arrays.toString(marks) +
                ", total=" + total +
                ", percentage=" + percentage +
                ", result='" + result + '\'' +
                '}';
    }
}
