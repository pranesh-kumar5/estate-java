import java.util.Scanner;

class Property
{
    int propertyId;
    String ownerName;
    String location;
    double price;

    static String companyName = "ABC Real Estate";

    Property(int id, String owner, String place, double amount)
    {
        propertyId = id;
        ownerName = owner;
        location = place;
        price = amount;
    }

    void display()
    {
        System.out.println("\n===== REAL ESTATE LISTING =====");
        System.out.println("Company  : " + companyName);
        System.out.println("ID       : " + propertyId);
        System.out.println("Owner    : " + ownerName);
        System.out.println("Location : " + location);
        System.out.println("Price    : Rs. " + price);
    }
}

class House extends Property
{
    House(int id, String owner, String place, double amount)
    {
        super(id, owner, place, amount);
    }
}

class LuxuryHouse extends House
{
    LuxuryHouse(int id, String owner, String place, double amount)
    {
        super(id, owner, place, amount);
    }
}

public class exp4a
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

        LuxuryHouse h = new LuxuryHouse(id, owner, location, price);

        h.display();

        sc.close();
    }
}