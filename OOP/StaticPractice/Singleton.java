package OOP.StaticPractice;

public class Singleton {

    private static Singleton singleton = new Singleton();
    private String defaultConfig;
    private Singleton()
    {
        defaultConfig = "XYZ-GENE";
    }

    public static Singleton getInstance()
    {
        return singleton;
    }

    public  String getConfig()
    {
       return defaultConfig;
    }
}

 class RunSingleton
{
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
}

