package OOP.Interfaces;

@FunctionalInterface
interface MyLambda
{
    void display(String str);

}

interface Arithemetic
{
    int add(int x, int y);

}
public class Lambda {
    public static void main(String[] args)
    {
//        MyLambda m=(s)->{System.out.println(s);};
//        m.display("I am displayed");
//
//        Arithemetic a=(x,y)->{return x + y;};
//        System.out.println(a.add(34, 67));
        StringBuilder s = new StringBuilder("were");
        System.out.println(s.charAt(1));
    }
}
