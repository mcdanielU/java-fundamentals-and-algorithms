package Basics.Method;

//Extract username from an email
public class ObjArg {
    String userName(String email)
    {
    int a = email.indexOf('@');
    String name = email.substring(0,a);
    return name;
    }

boolean isPrime(int number)
{

    if(number == 1 || number == 2)
    {
        return true;
    }
    for(int i = 2; i<number; i++)
    {
        if(number % i == 0)
        {
        return false;
        }
    }

    return true;

}

void greatestCommonDivisor(int a, int b)
{
    int diff;
while(a != b)
{
    int pivotValue = Math.max(a,b);
    int minorValue = Math.min(a,b);
     diff = pivotValue - minorValue;
     if(a == pivotValue)
     {
         a = diff;
     } else if (b == pivotValue) {
         b = diff;
     }


}
    System.out.println(a);
}
    public static void main(String[] args) {
        ObjArg obj = new ObjArg();
        System.out.println(obj.userName("ucheelekwa2@gmail.com"));
        System.out.println(obj.isPrime(43));
        obj.greatestCommonDivisor(17,5);
    }
}
