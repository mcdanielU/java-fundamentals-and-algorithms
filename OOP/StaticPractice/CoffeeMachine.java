package OOP.StaticPractice;

//Practice instance based static class

/**
 * This used where
 *  1.  Dynamic or Instance-Specific Configurations:
 * 	•	If different parts of your app (e.g., modules or users) need unique settings.
 * 	•	Example: Different language preferences for each user.
 * 	2.	Extensibility and Polymorphism:
 * 	•	If you plan to extend the configuration logic or use inheritance, static methods are less flexible.
 */
public class CoffeeMachine {
    //Initialize variables
    private float coffee;
    private float water;

    private static CoffeeMachine waterlooMachineConfig = null;
    private CoffeeMachine(){
        coffee = 1;
        water = 1;
    }

    public static CoffeeMachine getCoffeeConfiginstance()
    {
        if(waterlooMachineConfig == null)
        {
            waterlooMachineConfig = new CoffeeMachine();
        }
        return waterlooMachineConfig;
    }

    public float getCoffee()
    {
        return coffee;
    }

    public float getWater()
    {
        return water;
    }

    @Override
    public String toString() {
        return "Coffee Config "+coffee+"\n"+"Water Config: "+water;
    }
}

class RunCoffee
{
    public static void main(String[] args) {
        CoffeeMachine waterlooCoffeeConfig = CoffeeMachine.getCoffeeConfiginstance();
        System.out.println(waterlooCoffeeConfig.getWater());
    }
}