public class BeachVollyballTeam extends Team {

    private String player1;
    private String player2;

	public BeachVollyballTeam(String player1, String player2,
                    int wins, int losses) {
		super(player1 + " - " + player2, wins, losses);
        this.player1 = player1;
        this.player2 = player2;
	}

	public String getPlayer1() {
		return player1;
	}
	
	public String getPlayer2() {
		return player2;
	}

}