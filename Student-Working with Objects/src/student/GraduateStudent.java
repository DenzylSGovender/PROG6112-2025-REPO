
package student;


// GraduateStudent.java
public class GraduateStudent extends Student {
    public GraduateStudent(int studentID, String lastName) {
        super(studentID, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {//Depending how many semesters
        // Tuition for a GraduateStudent is R16000 per semester
        super.annualTuition = 16000 * 2; // Multiply by 2 for annual tuition//
    }
}

