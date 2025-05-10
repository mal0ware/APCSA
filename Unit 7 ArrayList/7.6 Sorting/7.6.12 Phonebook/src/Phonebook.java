import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<PhoneNumber> directory = new ArrayList<>();

    public void addNumber(PhoneNumber number)
    {
        directory.add(number);
        sort();
    }

    private void sort()
    {
        for (int i = 1; i < directory.size(); i++)
        {
            PhoneNumber key = directory.get(i);
            int j = i - 1;
            while (j >= 0 && directory.get(j).getName().compareTo(key.getName()) > 0)
            {
                directory.set(j + 1, directory.get(j));
                j = j - 1;
            }
            directory.set(j + 1, key);
        }
    }

    public void printPhoneBook()
    {
        for (PhoneNumber number : directory)
        {
            System.out.println(number.getName());
        }
    }
}