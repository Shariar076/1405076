/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

class Community
{
    private String department;
    private String institute;

    public Community(String department, String institute) {
        this.department = department;
        this.institute = institute;
    }
    void view()
    {
        System.out.println("Department : "+department);
        System.out.println("Institute : "+institute);
    }
}
class Employee extends Community
{
    String name;
    String employeeID;
    double salary;
    double increment;

    public Employee(String name, String employeeID, double salary, double increment, String department, String institute) {
        super(department, institute);
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.increment = increment;
    }
    void view()
    {
        super.view();
        System.out.println("Name : "+name);
        System.out.println("ID : "+employeeID);
        System.out.println("Salary : "+salary);
        System.out.println("Increment : "+increment);
    }
}
class Student extends Community
{
    String name;
    String studentId;
    String status;

    public Student(String name, String studentId, String status, String department, String institute) {
        super(department, institute);
        this.name = name;
        this.studentId = studentId;
        this.status = status;
    }
    void view()
    {
        super.view();
        System.out.println("Name : "+name);
        System.out.println("ID : "+studentId);
        System.out.println("Status : "+status);
    }
}
class Alumny extends Community
{
    String name;
    int passYear;

    public Alumny(String name, int passYear, String department, String institute) {
        super(department, institute);
        this.name = name;
        this.passYear = passYear;
    }
    void view()
    {
        super.view();
        System.out.println("Name : "+name);
        System.out.println("Pass Year : "+passYear);
    }
}
class Faculty extends Employee
{
    int facultyCode;
    String designation;
    int joinYear;

    public Faculty(int facultyCode, String designation, int joinYear, String name, String employeeID, double salary, double increment, String department, String institute) {
        super(name, employeeID, salary, increment, department, institute);
        this.facultyCode = facultyCode;
        this.designation = designation;
        this.joinYear = joinYear;
    }
    void view()
    {
        super.view();
        System.out.println("Faculty COde : "+facultyCode);
        System.out.println("Designation : "+designation);
        System.out.println("Join Year : "+joinYear);
    }
}
class Staff extends Employee
{
    int joinYear;
    int duration;

        public Staff(int joinYear, int duration, String name, String employeeID, double salary, double increment, String department, String institute) {
            super(name, employeeID, salary, increment, department, institute);
            this.joinYear = joinYear;
            this.duration = duration;
        }
    void view()
    {
        super.view();
        System.out.println("Join Year : "+joinYear);
        System.out.println("Duration : "+duration);
    }

}
class Administrator extends Faculty
{
    String position;
    double durarion;

        public Administrator(String position, double durarion, int facultyCode, String designation, int joinYear, String name, String employeeID, double salary, double increment, String department, String institute) {
            super(facultyCode, designation, joinYear, name, employeeID, salary, increment, department, institute);
            this.position = position;
            this.durarion = durarion;
        }
    void view()
    {
        super.view();
        System.out.println("Position : "+position);
        System.out.println("Duration : "+durarion);
    }
    
}
class Teacher extends Faculty
{
    int noCourses;
    double weeklyHour;

        public Teacher(int noCourses, double weeklyHour, int facultyCode, String designation, int joinYear, String name, String employeeID, double salary, double increment, String department, String institute) {
            super(facultyCode, designation, joinYear, name, employeeID, salary, increment, department, institute);
            this.noCourses = noCourses;
            this.weeklyHour = weeklyHour;
        }
    void view()
    {
        super.view();
        System.out.println("Number of Courses : "+noCourses);
        System.out.println("Weekly Hour : "+weeklyHour);
    }
}

public class UniversityHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
