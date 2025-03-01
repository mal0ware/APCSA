public class TeamTester {
    public static void main(String[] args) {
        Team dolphins = new FootballTeam("Dolphins", "Miami", 8, 4, 1);
        BeachVollyballTeam mayWalsh = new BeachVollyballTeam("May", "Walsh", 143, 6);
        Team lizards = new Team("Lizards", 9, 5);

        // Print out all available information for the Dolphins
        System.out.println(dolphins.getName());
        System.out.println(dolphins.getWins());
        System.out.println(dolphins.getLosses());
        System.out.println(((FootballTeam) dolphins).getLocation());
        System.out.println(((FootballTeam) dolphins).getTies());
        System.out.println(dolphins.toString());
        System.out.println();

        // Print out all available information for May/Walsh
        System.out.println(mayWalsh.getName());
        System.out.println(mayWalsh.getWins());
        System.out.println(mayWalsh.getLosses());
        System.out.println(mayWalsh.getPlayer1());
        System.out.println(mayWalsh.getPlayer2());
        System.out.println(mayWalsh.toString());
        System.out.println();

        // Print out all available information for the Lizards
        System.out.println(lizards.getName());
        System.out.println(lizards.getWins());
        System.out.println(lizards.getLosses());
        System.out.println(lizards.toString());
    }
}