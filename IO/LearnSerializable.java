package IO;

import java.io.*;
import java.util.Scanner;

class Person implements Serializable
{

    private String name;
    private int age;
    private int height;

    private transient String password;

    public Person(String name, int age, int height, String password )
    {
        this.name = name;
        this.age = age;
        this.height = height;
        this.password = password;
    }

    public void display()
    {

        System.out.println(this.name+" is "+this.age+" years old and is "+height+" meters in height. Transient value "+this.password);
    }
}

class Deserialize
{
    public void getObjecetValues() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/ucheelekwa/Desktop/JAVA/IO/person.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //read the object
        Person person = (Person) ois.readObject();

        fis.close();
        ois.close();

        person.display();

    }
}
public class LearnSerializable {
    public static void main(String[] args) throws Exception{
        Person person = new Person("Uche", 23, 185, "thisisme");

        //Create Output stream to a file
        FileOutputStream fos = new FileOutputStream("/Users/ucheelekwa/Desktop/JAVA/IO/person.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //Write the object to the file
        oos.writeObject(person);

        oos.close();
        fos.close();
        System.out.println("Serialization done!");

        System.out.println("Type in 1 to deserialize");
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        switch(input)
        {
            case 1:
            new Deserialize().getObjecetValues();
            break;
            default:
                System.out.println("Enter a valid option");
        }
    }
}
