package Basics;

public class variable {
    //Instance Variable is declared here - these variables are specific to an object
    boolean instVar;

    //Constructor Initialization
    public variable(boolean InstVar)
    {
        this.instVar = InstVar;
    }

    public void displayInstanceVariable()
    {
        boolean instVar = false;
        System.out.println(this.instVar);
    }
    private static Double getArea()
    {
        //Local variable
        double pi = 3.14;
        return pi;
    }
    public static void main(String args[]) {
    variable myVar = new variable(true);
    myVar.displayInstanceVariable();
    }

    //Method goes in here

}
