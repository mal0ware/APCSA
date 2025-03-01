import java.util.*;

public class CompanyTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<>();

        while (true) {
            System.out.print("Please enter a company name, enter 'exit' to quit: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Is this an online company, 'yes' or 'no': ");
            String isOnline = scanner.nextLine().trim().toLowerCase();

            if (isOnline.equals("yes")) {
                System.out.print("Please enter the website address: ");
                String website = scanner.nextLine();
                companies.add(new OnlineCompany(name, website));
            } else {
                System.out.print("Please enter the street address: ");
                String streetAddress = scanner.nextLine();
                System.out.print("Please enter the city: ");
                String city = scanner.nextLine();
                System.out.print("Please enter the state: ");
                String state = scanner.nextLine();
                companies.add(new Company(name, streetAddress, city, state));
            }
        }

        // Print all companies
        System.out.println();
        for (Company company : companies) {
            System.out.println(company);
            System.out.println();
        }

        scanner.close();
    }
}