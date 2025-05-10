import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer() 
    {
        tickets = new ArrayList<>();
    }

    public void addTicket(AirlineTicket ticket) 
    {
        tickets.add(ticket);
    }

    public ArrayList<AirlineTicket> getTickets() 
    {
        return tickets;
    }

    public TicketOrganizer(ArrayList<AirlineTicket> tickets) 
    {
        this.tickets = tickets;
    }

    public void printPassengersByBoardingGroup() 
    {
        for (int group = 1; group <= 5; group++) 
        {
            boolean groupHasPassengers = false;
            for (AirlineTicket ticket : tickets) 
            {
                if (ticket.getBoardingGroup() == group) 
                {
                    if (!groupHasPassengers) 
                    {
                        System.out.println("Boarding Group " + group + ":");
                        groupHasPassengers = true;
                    }
                    System.out.println(ticket.getName());
                }
            }
        }
    }

    public void canBoardTogether() 
    {
        boolean found = false;
        for (int i = 0; i < tickets.size() - 1; i++) 
        {
            AirlineTicket current = tickets.get(i);
            AirlineTicket next = tickets.get(i + 1);
            if (current.getRow() == next.getRow() && current.getBoardingGroup() == next.getBoardingGroup()) 
            {
                System.out.println(current.getName() + " can board with " + next.getName() + ".");
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("No passengers can board together.");
        }
    }
}