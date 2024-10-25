package OOP.Inheritance.CustomerInheritance;

class Customer {
    private String name;
    private double acctAmount;

    public Customer()
    {
        System.out.println("Customer constructor");
    }

    public Customer(String name)
    {
        this.name = name;
    }

    protected void makeAPayment(double paymentValue)
    {
        System.out.println("Payment made now");
        acctAmount = acctAmount - paymentValue;
    }

    protected String getCustomerName()
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

    public Member(String memberID, String customerName)
    {
        super(customerName);
        this.memberID = memberID;
    }

    protected String getMemberID()
    {
        return memberID;
    }


}

public class InheritConstructor
{
    public static void main(String[] args) {
       Member member = new Member("14/1148", "Yemi");
        System.out.println(member.getCustomerName());
        System.out.println(member.getMemberID());



    }
}