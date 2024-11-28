package OOP.AbstractMethods;

public abstract class KFCAbstract {
    public void makeItem()
    {
        System.out.println("Original recipe for Making consistent KFC item");
    }

    abstract void billing();
    abstract void offer();

}
