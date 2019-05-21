package by.cdp.ksr.task1.entity.person;

import by.cdp.ksr.task1.entity.common.Address;
import by.cdp.ksr.task1.entity.person.Person;

/**
 * Created by Vitali_Markusheusky on 5/14/2019.
 */
public class Student extends Person {
    private long phoneNumber;
    private String department;
    private int grade;

    public Student(String firstName, String lastName, String mildleName, String department, int grade) {
        super(firstName, lastName, mildleName);
        this.department = department;
        this.grade = grade;
    }

    public Student(String firstName, String lastName, String department, int grade) {
        super(firstName, lastName);
        this.department = department;
        this.grade = grade;
    }

    public Student(String firstName, String lastName, Address address, String department, int grade) {
        super(firstName, lastName, address);
        this.department = department;
        this.grade = grade;
    }

    public Student(String firstName, String lastName, String mildleName, Address address, String department, int grade) {
        super(firstName, lastName, mildleName, address);
        this.department = department;
        this.grade = grade;
    }

    public Student(String firstName, String lastName, String mildleName, long phoneNumber, String department, int grade) {
        super(firstName, lastName, mildleName);
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.grade = grade;
    }

    public Student(String firstName, String lastName, long phoneNumber, String department, int grade) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.grade = grade;
    }

    public Student(String firstName, String lastName, Address address, long phoneNumber, String department, int grade) {
        super(firstName, lastName, address);
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.grade = grade;
    }

    public Student(String firstName, String lastName, String mildleName, Address address, long phoneNumber, String department, int grade) {
        super(firstName, lastName, mildleName, address);
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.grade = grade;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (phoneNumber != student.phoneNumber) return false;
        if (grade != student.grade) return false;
        return department.equals(student.department);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        result = 31 * result + department.hashCode();
        result = 31 * result + grade;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "phoneNumber=" + phoneNumber +
                ", department='" + department + '\'' +
                ", grade=" + grade +
                '}';
    }
}
