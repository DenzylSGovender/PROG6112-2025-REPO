
package person;


public class Student extends Person {
//a new class is defined that extends (inherits) from the Person class
    //the Student class will inhert all the attributes and methods of the Person class
    
    private int studentId;

    public Student(String name, int studentId) {
// this constructor takes two parameters
        super(name);//Super is used to call the constructor of the parent (Person)
        this.studentId = studentId;
    }

    public int getStudentId() {//public method
        return studentId;// return is used to return an integer value
    }

    public void introduce() {
//Another method responsible for printing a welcome message
        //void is used because it does not return a value
        System.out.println("Hi, I'm " + getName() + " and my student ID is " + studentId + ".");
    }
}

