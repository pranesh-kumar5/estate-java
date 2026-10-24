class Property
{
    private int propertyId;
    private String ownerName;
    private String location;
    private double price;

    static String companyName = "ABC Real Estate";

    Property(int id, String owner, String place, double amount)
    {
        propertyId = id;
        ownerName = owner;
        location = place;
        price = amount;
    }

    Property(int id, String owner)
    {
        propertyId = id;
        ownerName = owner;
        location = "Not Available";
        price = 0;
    }

    public int getPropertyId()
    {
        return propertyId;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public String getLocation()
    {
        return location;
    }

    public double getPrice()
    {
        return price;
    }

    public void display()
    {
        System.out.println("===== REAL ESTATE LISTING SYSTEM =====");
        System.out.println("Company Name : " + companyName);
        System.out.println("Property ID  : " + getPropertyId());
        System.out.println("Owner Name   : " + getOwnerName());
        System.out.println("Location     : " + getLocation());
        System.out.println("Price        : Rs. " + getPrice());
        System.out.println();
    }
}

class House extends Property
{
    House(int id, String owner, String place, double amount)
    {
        super(id, owner, place, amount);
    }

    House(int id, String owner)
    {
        super(id, owner);
    }
}

public class RealEstateListing
{
    public static void main(String[] args)
    {
        House h1 = new House(120, "Kumar", "Chennai", 4500000);

        House h2 = new House(121, "Ravi");

        h1.display();
        h2.display();
    }
}
