import java.util.Scanner;

class Property
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

    void display()
    {
        System.out.println("Property ID : " + propertyId);
        System.out.println("Owner       : " + ownerName);
        System.out.println("Location    : " + location);
        System.out.println("Price       : Rs. " + price);
    }

    void check()
    {
        System.out.println("Property is available");
    }
}

class House extends Property
{
    House(int id, String owner, String place, double amount)
    {
        super(id, owner, place, amount);
    }

    void display()
    {
        System.out.println("\n===== HOUSE =====");
        System.out.println("Property ID : " + propertyId);
        System.out.println("Owner       : " + ownerName);
        System.out.println("Location    : " + location);
        System.out.println("Price       : Rs. " + price);
    }

    void check()
    {
        System.out.println("House is available");
    }
}

class LuxuryHouse extends House
{
    LuxuryHouse(int id, String owner, String place, double amount)
    {
        super(id, owner, place, amount);
    }

    void display()
    {
        System.out.println("\n===== LUXURY HOUSE =====");
        System.out.println("Property ID : " + propertyId);
        System.out.println("Owner       : " + ownerName);
        System.out.println("Location    : " + location);
        System.out.println("Price       : Rs. " + price);
    }

    void check()
    {
        System.out.println("Luxury House is available");
    }
}

public class exp5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Property ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Property p = new LuxuryHouse(id, owner, location, price);

        p.display();
        p.check();

        sc.close();
    }
}