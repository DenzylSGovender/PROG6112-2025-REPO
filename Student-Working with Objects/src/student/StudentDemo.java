package student;
// StudentDemo.java
public class StudentDemo {
    public static void main(String[] args) {
       
        Student[] students = new Student[6];// create your array of objects
        
        students[0] = new UndergraduateStudent(1, "Govender");
        students[1] = new UndergraduateStudent(2, "Pollock");
        
        students[2] = new GraduateStudent(3, "Lesnar");
        students[3] = new GraduateStudent(4, "Goldberg");
        
        students[4] = new StudentAtLarge(5, "Naicker");
        students[5] = new StudentAtLarge(6, "Smith");

        for (Student student : students) {//See how you wish to display- Redesign your output
            System.out.println(student);
        }
    }
}

