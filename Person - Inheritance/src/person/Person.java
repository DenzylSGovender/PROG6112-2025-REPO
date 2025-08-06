
package person;


public class Person {// 
 private String name;//Private access modifier declaration limited to this class

    public Person(String name) {//setup your constructor
        this.name = name;
    }

    public String getName() {//this is a public method
        return name;
    }
 
}
