package student;

// StudentAtLarge.java
public class StudentAtLarge extends Student {
    public StudentAtLarge(int studentID, String lastName) {
        super(studentID, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {//Depending how many semesters
        // Tuition for a StudentAtLarge is R20000 per semester
        super.annualTuition = 20000 * 2; // Multiply by 2 for annual tuition
    }
}

