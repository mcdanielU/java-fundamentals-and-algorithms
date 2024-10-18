package Basics.StringClass;

public class ReverseString {

        public static void main(String[] args) {
            String str = "red";
            StringBuffer buf = new StringBuffer(str);
            buf.reverse();
            System.out.println(buf);
        }

}
