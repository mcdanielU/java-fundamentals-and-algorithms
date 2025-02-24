package JavaLang;

class TestObject
{
    public String getme()
    {
        return "me";
    }

    @Override
    public String toString()
    {
        return "Taylor Swift";
    }

    public StringBuffer binRepresentation()
    {
        StringBuffer buff = new StringBuffer("Uche");

        return buff;
    }
}
public class LangDemo {

    public static void main(String[] args) {
        TestObject t = new TestObject();
        Object obj = new Object();
        System.out.println(t.binRepresentation());
    }
}
