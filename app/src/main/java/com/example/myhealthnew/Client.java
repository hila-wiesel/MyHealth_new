package com.example.myhealthnew;

public class Client extends User {
    private double height;
    private double weight;
    private String city;
    private String country;
    private int birthYear;
    private String gender;
    private int waterReminderFrequency;
    private int sportReminderFrequency;
    private int recommendedCaloriesPerDay;
    private int leftCaloriesPerDay;


    public Client(String email, String password) {
        super(email, password);

    }
}
