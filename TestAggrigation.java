package Association;
import java.io.*;
import java.util.*;
class Student {
    String name;
    int id;
    String dept;
    Student(String name, int id, String dept)
    {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}
class Department {
  
    String name;
    private List<Student> students;
    Department(String name, List<Student> students)
    {
        this.name = name;
        this.students = students;
    }

    public List<Student> getStudents()
    {
       
        return students;
    }
}
 

class Institute {
    String instituteName;
    private List<Department> departments;
 
    Institute(String instituteName,List<Department> departments)
    {
        this.instituteName = instituteName;
        this.departments = departments;
    }
 
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students;
 
        for (Department dept : departments) {
            students = dept.getStudents();
 
            for (Student s : students) {
                noOfStudents++;
            }
        }
 
        return noOfStudents;
    }
}

class TestAggrigation{
 
    public static void main(String[] args)
    {
        Student s1 = new Student("Ankit", 1, "mca");
        Student s2 = new Student("Tanuja", 2, "bca");
        Student s3 = new Student("Rajan", 1, "mca");
        Student s4 = new Student("Anchal", 2, "bca");
        Student s6 = new Student("Radha", 1, "mca");
        Student s7 = new Student("shivvi", 2, "bca");
 
 
        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);
        List<Student> ee_students
            = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
 
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
        Institute institute = new Institute("BITS", departments);
        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
    }
}

