import java.util.ArrayList;

public class Roster
{
    // Implement the student ArrayList 
    // or copy from previous exercise
    static ArrayList <Student> classList = new ArrayList <Student> ();
    
    public static void addStudent(String name, int grade)
    {
        // Create Student
        // or copy from previous exercise
        Student student = new Student(name, grade);
        
        // Add to classList
        // or copy from previous exercise
        classList.add(student);
        
    }
    
    
    //Add the static methods here:
    public static String getLastStudent()
    {
        return classList.get(classList.size()-1).getName();
    }
    public static int getClassSize()
    {
        return classList.size();
    }
    public static void addStudent(int index, String name, int grade)
    {
        Student student = new Student(name, grade);
        classList.add(index, student);
    }

    public static String getStudent(int index)
    {
        return classList.get(index).getName();
    }
    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}