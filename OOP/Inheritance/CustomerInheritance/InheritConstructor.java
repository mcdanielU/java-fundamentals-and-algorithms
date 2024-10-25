package OOP.Inheritance.CustomerInheritance;

class Customer {
    private String name;
    private double acctAmount;

    public Customer()
    {
        System.out.println("Customer constructor");
    }

    protected void makeAPayment(double paymentValue)
    {
        System.out.println("Payment made now");
        acctAmount = acctAmount - paymentValue;
    }

    protected String getName()
    {
        return name;
    }

    protected void setName(String name)
    {
    this.name =  name;
    }

    protected double retrieveAccountBalance()
    {
        return acctAmount;
    }
}

class Member extends Customer{

    private String memberID;
    public Member()
    {
        System.out.println("Member constrcutor is executed here");
    }

    @Override
    protected String getName()
    {
        return "Firedown";
    }

}

public class InheritConstructor
{
    public static void main(String[] args) {
       Member member = new Member();
       Customer customer = new Customer();
       member.setName("Uche");
        System.out.println(member.getName());


    }
}