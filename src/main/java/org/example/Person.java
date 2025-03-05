package org.example;

public class Person {
    // Instance variables
    private String firstName;
    private String lastName;
    private int age;

    // Additional instance variables
    private String address;
    private String phoneNumber;
    private String email;

    // Constructor for firstName, lastName, age
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Overloaded constructor for firstName, lastName, age, address, phoneNumber, email
    public Person(String firstName, String lastName, int age, String address, String phoneNumber, String email) {
        this(firstName, lastName, age);  // Constructor chaining
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter methods for address, phoneNumber, and email
    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // Methods for firstName, lastName, age
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
