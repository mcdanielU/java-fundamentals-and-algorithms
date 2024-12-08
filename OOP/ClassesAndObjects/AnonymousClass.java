package OOP.ClassesAndObjects;
import java.util.Comparator;
class LightClick
{
    void tap(){};
    void smartSpeech(){};
}


public class AnonymousClass {
    public static void main(String[] args) {
         int a = 10;
     new LightClick()
     {
         @Override
         public void tap()
         {
             System.out.println("Light was clicked at "+a+" intensity");
         }

         @Override
         public void smartSpeech() {
             System.out.println("AI speec woke up the light ");
         }
         ;
     }.tap();
    }
}
