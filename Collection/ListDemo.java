package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> elekwas = new ArrayList<>(List.of("Uche", "amara", "Oge", "Somto"));


        elekwas.add("Amanda");
        elekwas.contains("Amanda");

        try {
            for (String x :
                    elekwas) {
                System.out.println(elekwas.get(4));
            }
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println("Exception: You are trying to access an element not at the end of this list");
        }
    }
}
