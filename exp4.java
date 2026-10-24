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

    void houseType()
    {
        System.out.println("Type     : Independent House");
    }
}

class Apartment extends Property
{
    Apartment(int id, String owner, String place, double amount)
    {
        super(id, owner, place, amount);
    }

    void apartmentType()
    {
        System.out.println("Type     : Apartment");
    }
}

public class exp4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter House ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter House Owner: ");
        String owner1 = sc.nextLine();

        System.out.print("Enter House Location: ");
        String location1 = sc.nextLine();

        System.out.print("Enter House Price: ");
        double price1 = sc.nextDouble();

        House h = new House(id1, owner1, location1, price1);

        System.out.print("\nEnter Apartment ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Apartment Owner: ");
        String owner2 = sc.nextLine();

        System.out.print("Enter Apartment Location: ");
        String location2 = sc.nextLine();

        System.out.print("Enter Apartment Price: ");
        double price2 = sc.nextDouble();

        Apartment a = new Apartment(id2, owner2, location2, price2);

        System.out.println("\n===== HOUSE =====");
        h.display();
        h.houseType();

        System.out.println("\n===== APARTMENT =====");
        a.display();
        a.apartmentType();

        sc.close();
    }
}