public  class FootballTeam extends Team {

    private int ties;
    private String location;

	public FootballTeam(String name, String location,
                    int wins, int losses, int ties) {
		super(name, wins, losses);
		this.ties = ties;
		this.location = location;
	}

	public int getTies() {
		return ties;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	@Override
    public String toString(){
        return super.getWins() + " - " + super.getLosses() + " - " + ties;
    }
}