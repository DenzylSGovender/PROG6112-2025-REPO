package enumexample;

enum Day{//Start of structure
    Sunday("Weekend"),
    Monday("Weekday"),
    Tuesday("Weekday"),
    Wednesday("Weekday"),
    Thursday("Weekday"),
    Friday("Weekday"),
    Saturday("Weekend");
    
    private final String dayType;

    private Day(String dayType) 
    {
    this.dayType = dayType;
    }
    
    public String getDayType() 
    {
        return dayType;
}
    
}//End of structure


public class EnumExample {

    public static void main(String[] args) {
         Day today = Day.Monday;
          
        System.out.println("Today is " + today);
        
        System.out.println("Today is a " + today.getDayType());
         
        for (Day day : Day.values()) 
        {
            System.out.println(day + " is a " + day.getDayType());
        }
    }
    
}
