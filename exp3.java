import java.util.Scanner;

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
        System.out.println("\n===== REAL ESTATE LISTING =====");
        System.out.println("Company  : " + companyName);
        System.out.println("ID       : " + getPropertyId());
        System.out.println("Owner    : " + getOwnerName());
        System.out.println("Location : " + getLocation());
        System.out.println("Price    : Rs. " + getPrice());
    }
}

public class exp3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Owner: ");
        String owner = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Property p1 = new Property(id, owner, location, price);

        System.out.print("\nEnter Second ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Second Owner: ");
        String owner2 = sc.nextLine();

        Property p2 = new Property(id2, owner2);

        p1.display();
        p2.display();

        sc.close();
    }
}