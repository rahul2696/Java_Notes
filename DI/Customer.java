public class Customer
{
    private String custnm;
    private String mobile;
    private Product obj;

    public Customer(String custnm,String mobile,Product obj)
    {
        this.custnm=custnm;
        this.mobile=mobile;
        this.obj=obj;
        //obj=new Product("Amazon Fire Stick",4500.00);

    }

    public void getCustomerDetails()
    {
        System.out.println("Customer Name : "+custnm);
        System.out.println("Mobile        : "+mobile);
        obj.getProductInfo();
    }
}