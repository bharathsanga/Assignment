package com.greycampus;

import java.util.Scanner;

public class InputValueFromUser {
	public static void main(String[] args) {
        Deatils details = new Deatils();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Customer id : ");
        int cid = scanner.nextInt();
        System.out.print("Enter firstname : ");
        String firstname = scanner.next();
        System.out.print("Enter lastname : ");
        String lastname = scanner.next();
        System.out.print("Enter street : ");
        String street = scanner.next();
        System.out.print("Enter city : ");
        String city = scanner.next();
        System.out.print("Enter state : ");
        String state = scanner.next();
        System.out.print("Enter zipcode : ");
        int zipcode = scanner.nextInt();
        System.out.print("Enter Product name : ");
        String product_name = scanner.next();

        System.out.print("Enter Creator name : ");
        String Created_by = scanner.next();

        details.setCid(cid);
        details.setFirstname(firstname);
        details.setLastname(lastname);
        details.setStreet(street);
        details.setCity(city);
        details.setState(state);
        details.setZipcode(zipcode);
        details.setProduct_name(product_name);
        details.setCreated_by(Created_by);

        ConnectToDatabase connectToDatabase = new ConnectToDatabase();
        int count = connectToDatabase.DataConnection(details);
        System.out.println(count);

    }

}
