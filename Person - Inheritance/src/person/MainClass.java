
package person;


public class MainClass {
    
    public static void main(String[] args) {
//This creates an instance of a class called person using the constructor
        Person person = new Person("Johnny");
        
//This creates an instance of the class called Student using the constructor
        Student student = new Student("Sam", 55332);
 
  
        System.out.println("Person: " + person.getName());
//This prints the name of the person object( which is Johnny)
        
        System.out.println("Student: " + student.getName() + ", Student ID: " + student.getStudentId());
//This prints Sam with student id 55332
        
        student.introduce();// this calls the method from the student class
    }
}
    
