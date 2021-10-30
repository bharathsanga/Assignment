package com.greycampus;

import java.util.Scanner;

public class TakingUpdatedData {
	public static void main(String[] args) {

        DetailsDataUpdate detailsDataUpdate = new DetailsDataUpdate();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Customer id where we want to update : ");
        int cid = scanner.nextInt();
        System.out.print("Enter street to be updated : ");
        String street = scanner.next();
        System.out.print("Enter city to be updated : ");
        String city = scanner.next();
        System.out.print("Enter state to be updated : ");
        String state = scanner.next();
        System.out.print("Enter zipcode to be updated : ");
        int zipcode = scanner.nextInt();
        System.out.print("Enter Product name to be updated : ");
        String product_name = scanner.next();

        System.out.print("Enter Update user name : ");
        String Updated_by = scanner.next();

        detailsDataUpdate.setCid(cid);
        detailsDataUpdate.setStreet(street);
        detailsDataUpdate.setCity(city);
        detailsDataUpdate.setState(state);
        detailsDataUpdate.setZipcode(zipcode);
        detailsDataUpdate.setProduct_name(product_name);
        detailsDataUpdate.setUpdated_by(Updated_by);

        DataUpdation dataUpdation = new DataUpdation();
        int count = dataUpdation.UpdateData(detailsDataUpdate);
        System.out.println(count);
    }

}
