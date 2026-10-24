import java.util.Scanner;

interface PropertyDetails
{
    void display();
    void check();
}

class House implements PropertyDetails
{
    int propertyId;
    String ownerName;
    String location;
    double price;

    House(int id, String owner, String place, double amount)
    {
        propertyId = id;
        ownerName = owner;
        location = place;
        price = amount;
    }

    public void display()
    {
        System.out.println("\n===== HOUSE DETAILS =====");
        System.out.println("Property ID : " + propertyId);
        System.out.println("Owner       : " + ownerName);
        System.out.println("Location    : " + location);
        System.out.println("Price       : Rs. " + price);
    }

    public void check()
    {
        System.out.println("House is available");
    }
}

public class exp6
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

        PropertyDetails p = new House(id, owner, location, price);

        p.display();
        p.check();

        sc.close();
    }
}