package org.example;

public class Main {
    public static void main(String[] args) {
        // Person sınıfından nesneler oluşturuluyor
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Jane", "Smith", 17);
        Person person3 = new Person("Alice", "Johnson", 14, "1234 Elm St", "555-1234", "alice@example.com");

        // Person bilgilerini yazdırma
        System.out.println("Person 1:");
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        System.out.println("\nPerson 2:");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen: " + person2.isTeen());

        System.out.println("\nPerson 3:");
        System.out.println("Firstname: " + person3.getFirstName());
        System.out.println("LastName: " + person3.getLastName());
        System.out.println("Age: " + person3.getAge());
        System.out.println("Is Teen: " + person3.isTeen());
        System.out.println("Address: " + person3.getAddress()); // Access via getter
        System.out.println("Phone: " + person3.getPhoneNumber()); // Access via getter
        System.out.println("Email: " + person3.getEmail()); // Access via getter

        // Wall sınıfından nesne oluşturuluyor
        Wall wall = new Wall(5, 4);
        System.out.println("\nArea of the Wall: " + wall.getArea());

        // Set height to negative value and print new values
        wall.setHeight(-1.5);
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());
    }
}
