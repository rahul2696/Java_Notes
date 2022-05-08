public class Product
{
    private String prodnm;
    private double price;

    public Product(String prodnm,double price)
    {
        this.prodnm=prodnm;
        this.price=price;
    }

    public void getProductInfo()
    {
        System.out.println("Product Name : "+prodnm);
        System.out.println("Price        : "+price);
    }
}