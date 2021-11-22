package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println("|                .:: HashMap in Java ::.                                |");
        System.out.println("|     A HashMap however, store items in 'Keys / Values' pairs,          |");
        System.out.println("|        and you can access them by an index of another type            |");
        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println();

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Portugal", "Lisbon");
        System.out.println(capitalCities);
        System.out.println("Size: " + capitalCities.size());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + ", value: " + capitalCities.get(i));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(capitalCities.get("Portugal"));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        capitalCities.remove("England");
        System.out.println(capitalCities);
        System.out.println("Size: " + capitalCities.size());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        capitalCities.clear();
        System.out.println(capitalCities);
        System.out.println("Size: " + capitalCities.size());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
