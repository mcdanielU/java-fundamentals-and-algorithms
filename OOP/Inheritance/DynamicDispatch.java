package OOP.Inheritance;


/**
 * Java class to demonstrate the usefulness of
 * Dynamic Dispatch in inheritance coding
 * @author ucheelekwa
 * @return
 * @see TV
 *
 */
class TV
{
    public void switchOn()
    {
        System.out.println("TV is switched on");
    }
    public void changeChannel()
    {
        System.out.println("Channel is changed");
    }
}

class SmartTV extends TV
{
    @Override
    public void switchOn()
    {
        System.out.println("Smart TV is switched on");
    }
    @Override
    public void changeChannel()
    {
        System.out.println("SmartTv channel is changed");
    }

    public void browse()
    {
        System.out.println("Smart Tv is browsing ");
    }
}
public class  DynamicDispatch {

    public static void main(String[] args) {
        TV Smarttv = new SmartTV();
        SmartTV td = new SmartTV();
//        SmartTV ref = new TV(); You cant have a sub class reference referencing a super class object because this breaks the rule of inheritance
        Smarttv.changeChannel(); //calls smart TV function
        Smarttv.switchOn(); //calls smart TV function
        td.browse(); // calls smartTV browsing function
//        tv.browse(); this will not work as the Tv reference allows only calling the methods the TV class had
    }
}
