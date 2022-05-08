class DepInject
{
    public static void main(String args[])
    {
        Product p1,p2;
        Customer c;

        p1=new Product("Bosch washing machine",39500.00);
        c=new Customer("jos buttler","9988711223",p1);
        c.getCustomerDetails();

        System.out.println("----------------------");
        p2=new Product("samsung SSD 240GB",2500.00);
        c=new Customer("imran khan","9028295566",p2);
        c.getCustomerDetails();

    }
}