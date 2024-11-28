package OOP.Interfaces;

interface FirstInterface {
    void displayme();
    int calculate();
}

public class ImplementFirstInterface implements FirstInterface
{
    public void displayme()
    {
        System.out.println("yes i am returned");
    }

    public int calculate()
    {
     return 2+2;
    }

    double beef()
    {
        return 3.4;
    }

    public static void main(String[] args) {
        System.out.println(new ImplementFirstInterface().calculate());
        new ImplementFirstInterface().displayme();
        new ImplementFirstInterface().beef();
    }

}
