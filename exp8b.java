class Property extends Thread
{
    int propertyId;
    String ownerName;
    String location;
    double price;

    Property(int id, String owner, String place, double amount)
    {
        propertyId = id;
        ownerName = owner;
        location = place;
        price = amount;
    }

    public void run()
    {
        System.out.println("===== REAL ESTATE LISTING SYSTEM =====");
        System.out.println("Property ID : " + propertyId);
        System.out.println("Owner Name  : " + ownerName);
        System.out.println("Location    : " + location);
        System.out.println("Price       : Rs. " + price);
    }
}
/
public class exp8b
{
    public static void main(String[] args)
    {
        Property p1 = new Property(101, "Ramesh", "Chennai", 4500000);

        p1.start();
    }
}