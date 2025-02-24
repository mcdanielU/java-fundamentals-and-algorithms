package JavaLang;

enum Dept
{
    CS, IT, CIVIL, ECE
}
public class EnumDemo {
    public static void main(String[] args) {
        Dept d = Dept.CS;
        Dept e = Dept.IT;
        Dept list [] = Dept.values();
        for(Dept x: list)
        {
            System.out.println(x);
        }
    }
}
