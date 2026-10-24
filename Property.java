package pranesh.collage; 

import java.util.*;

class Person {
    String name, mob_no, email_address;

    public void input(Scanner sc) {
        System.out.println("Enter Owner Name:");
        name = sc.nextLine();
        System.out.println("Enter Mobile Number:");
        mob_no = sc.nextLine();
        System.out.println("Enter Email:");
        email_address = sc.nextLine();
    }
}

class RealEstate extends Person {
    int property_id;
    String location, property_type;
    double price;

    public void getinput(Scanner sc) {
        System.out.println("Enter Property ID:");
        property_id = sc.nextInt();
        sc.nextLine(); // Consumes the leftover newline character
        System.out.println("Enter Property Type:");
        property_type = sc.nextLine();
        System.out.println("Enter Location:");
        location = sc.nextLine();
        System.out.println("Enter Property Price:");
        price = sc.nextDouble();
        sc.nextLine(); // Consumes the leftover newline character
    }
}

// This class must match the filename Property.java
public class Property extends RealEstate {
    public void display() {
        System.out.println("\n===== REAL ESTATE LISTING =====");
        System.out.println("Property ID   : " + property_id);
        System.out.println("Owner Name    : " + name);
        System.out.println("Property Type : " + property_type);
        System.out.println("Location      : " + location);
        System.out.println("Price         : Rs. " + price);
        System.out.println("Mobile Number : " + mob_no);
        System.out.println("Email         : " + email_address);
    }
}
