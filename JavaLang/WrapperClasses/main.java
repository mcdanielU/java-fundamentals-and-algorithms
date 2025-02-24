package JavaLang.WrapperClasses;

public class main {
    public static void main(String[] args) {
        byte bb = 127;
        Byte b = Byte.valueOf(bb);

        Integer i = Integer.valueOf(1203);
        System.out.println(        i.byteValue());
    }
}
