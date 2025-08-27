package student;
public abstract class Student {
    private int studentID;//Up to you what access modifiers you use
    private String lastName;
    public double annualTuition;

    public Student(int studentID, String lastName) {
        this.studentID = studentID;
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAnnualTuition() {
        return annualTuition;
    }

    public abstract void setTuition();

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Last Name: " + lastName + ", Annual Tuition: " + annualTuition;
    }
}

