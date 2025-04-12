package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListDemo {
    public static void main(String[] args) {
        List<String> elekwas = new ArrayList<>(Set.of("Uche", "amara", "Oge", "Somto","Amanda","Amanda","Amanda"));



//        System.out.println(elekwas.indexOf("Amanda"));
//        elekwas.contains("Amanda");

        try {
            for (String x :
                    elekwas) {
                System.out.println(x);
            }
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println("Exception: You are trying to access an element not at the end of this list");
        }
    }
}
