import java.util.ArrayList;
public class ArrayListMethods
{
    public static void print(ArrayList<String> list)
    {
        for(String skibidi : list)
        {
            System.out.println(skibidi);
        }
    }

    public static void condense(ArrayList<String> list)
    {
        for(int i = 0; i < list.size()/2; i++)
        {
            String newskibidi = list.get(i) + list.get(i+1);
            list.remove(i+1);
            list.set(i, newskibidi);
        }
    }
    public static void duplicate(ArrayList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            list.add(i+1, list.get(i));
            i++;
        }
    }
}