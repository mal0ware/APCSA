import java.util.ArrayList;

public class DataPurge
{

    // Method to remove duplicate emails
    public static void removeDuplicates(ArrayList<String> emails)
    {
        ArrayList<String> uniqueEmails = new ArrayList<>();
        ArrayList<String> duplicates = new ArrayList<>();

        for (String email : emails)
        {
            if (!uniqueEmails.contains(email))
            {
                uniqueEmails.add(email);
            }
            else
            {
                duplicates.add(email);
            }
        }

        // Update the original list and print removed duplicates
        emails.clear();
        emails.addAll(uniqueEmails);
        System.out.println("Removed duplicate emails: " + duplicates);
    }

    // Method to remove AOL emails
    public static void removeAOL(ArrayList<String> emails)
    {
        ArrayList<String> removed = new ArrayList<>();

        emails.removeIf(email ->
        {
            if (email.endsWith("@aol.com"))
            {
                removed.add(email);
                return true; // Remove AOL email
            }
            return false;
        });

        // Print removed AOL emails
        System.out.println("Removed AOL emails: " + removed);
    }

    // Method to check if all entries are valid email addresses
    public static boolean containsOnlyEmails(ArrayList<String> emails)
    {
        for (String email : emails)
        {
            if (!email.contains("@") || !email.contains("."))
            {
                return false; // Not a valid email address
            }
        }
        return true; // All entries are valid email addresses
    }
}