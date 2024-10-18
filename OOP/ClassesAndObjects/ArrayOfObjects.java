package OOP.ClassesAndObjects;
/*
This Java program demonstrates how to create an array of objects.

In the 'Subject' class, each subject has a subject ID (subId), a name, and a maximum grade.
We then define an array of 'Subject' objects, where each element in the array represents an instance of the 'Subject' class.
The array 'sub' is initialized to hold 3 objects, and we assign each element in the array with a new 'Subject' object.
This is an example of using arrays to store and manage multiple objects of the same class efficiently.
*/class Subject
{
    private String subId;
    private String name;
    private int maxGrade;

    Subject(String subId, String name, int maxGrade)
    {
        this.subId = subId;
        this.name = name;
        this.maxGrade = maxGrade;
    }

    @Override
    public String toString()
    {
        return "\nSubject ID:"+subId;
    }


}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Subject sub[] = new Subject[3];
        sub[0] = new Subject("s101", "DS", 100);
        sub[1] = new Subject("s102","Future", 100);
        sub[2] = new Subject("s103", "Operating Systems", 100);

        for(Subject s: sub)
            System.out.println(s);
    }



}
