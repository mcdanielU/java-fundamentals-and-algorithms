package OOP.AbstractMethods;

 class MyKFC extends KFCAbstract{
     public MyKFC()
     {
         System.out.println("Add initial state variables in this constructor");
     }
    @Override
    void billing()
    {
        System.out.println("Billing my own way");
    }

    @Override
    void offer()
    {
        System.out.println("Uche KFC offer");
    }

    void festiveOffer()
    {
        System.out.println("Implementing my own method festiveoffer");
    }

}

public class MyKFCMain{
    public static void main(String[] args) {
        MyKFC kfc = new MyKFC();
        kfc.billing();
        kfc.festiveOffer();
        kfc.offer();
        kfc.makeItem();
    }
}
