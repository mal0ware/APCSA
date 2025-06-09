public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getMostImprovedStudent()
    {
        // your code goes here! 
        if (numStudentsAdded == 0)
        {
            return null;
        }
        Student mostImproved = students[0];
        int maxRange = students[0].getExamRange();

        for (int i = 1; i < numStudentsAdded; i++) 
        {
            int currentRange = students[i].getExamRange();
            if (currentRange > maxRange) 
            {
                maxRange = currentRange;
                mostImproved = students[i];
            }
        }
        return mostImproved;
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}