package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseFour {

    public static void main(String[] args) {

        class Vendor {

            private String name;
            private String category;
            private String phone;
            private String email;
            private String city;
            private String country;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

        }

        List<Vendor> vendors = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vendors (min 3): ");
        int count = scanner.nextInt();

        for (int c = 0; c < count; c++) {
            System.out.println("Company " + (c + 1));
            System.out.println("=========");
            Vendor vendor = new Vendor();
            System.out.print("Name: ");
            vendor.setName(scanner.next());
            System.out.print("Category: ");
            vendor.setCategory(scanner.next());
            System.out.print("Phone: ");
            vendor.setPhone(scanner.next());
            System.out.print("Email: ");
            vendor.setEmail(scanner.next());
            System.out.print("City: ");
            vendor.setCity(scanner.next());
            System.out.print("Country: ");
            vendor.setCountry(scanner.next());
            System.out.println();

            vendors.add(vendor);
        }

        scanner.close();

        for (int c = 0; c < count; c++) {
            System.out.println("=== Company " + (c + 1) + " ===");
            Vendor vendor = vendors.get(c);
            System.out.println("Name: " + vendor.getName());
            System.out.println("Category: " + vendor.getCategory());
            System.out.println("Phone: " + vendor.getPhone());
            System.out.println("Email: " + vendor.getEmail());
            System.out.println("City: " + vendor.getCity());
            System.out.println("Country: " + vendor.getCountry());
            System.out.println();
        }
    }
}

