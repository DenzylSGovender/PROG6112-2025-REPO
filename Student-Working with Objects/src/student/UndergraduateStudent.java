

package student;


// UndergraduateStudent.java
public class UndergraduateStudent extends Student {
    public UndergraduateStudent(int studentID, String lastName) {
        super(studentID, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {//Depending how many semesters
        // Tuition for an UndergraduateStudent is R14000 per semester
        super.annualTuition = 14000 * 2; // Multiply by 2 for annual tuition
    }
}

