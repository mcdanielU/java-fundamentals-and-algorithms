package IO;

import java.io.*;

class Student
{
    public String color;
    public String name;
    public String dept;
}
public class PrintStreamDemo {

    public static void main(String[] args) throws Exception {
        FileInputStream fs = new FileInputStream("/Users/ucheelekwa/Desktop/JAVA/IO/utch.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fs));

        Student s = new Student();
        s.color = br.readLine();
        s.name = br.readLine();
        s.dept = br.readLine();


        System.out.println("Color "+s.color);
        System.out.println("Name "+s.name);
        System.out.println("Dept "+s.dept);
    }
}
