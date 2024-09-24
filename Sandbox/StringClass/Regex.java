package Sandbox.StringClass;

public class Regex {
    public static void main(String[] args) {
        String str1 = "a";
        System.out.println(new Regex().isBinary(str1));

    }

    public boolean isBinary(String value)
    {
        return value.matches(".*1.");
    }
}
