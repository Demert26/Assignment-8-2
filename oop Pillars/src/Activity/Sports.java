package Activity;

public class Sports {
    private int numTeams;
    private int numPlayers;

    private String teamName;
    private String starPlayer;
    boolean baseballBat;

    static int numPositions;



   public Sports(){

   }

    public Sports(int numTeams, int numPlayers, int numPositions, String teamName, String starPlayer, boolean baseballBat){
       this.numTeams = numTeams;
       this.numPlayers = numPlayers;
       this.numPositions = numPositions;
       this.starPlayer  = starPlayer;
       this.teamName = teamName;
       this.baseballBat = baseballBat;




    }
    public int getNumTeams(){
       return this.numTeams;
    }

    public void setnumTeams(int numTeams) {
         this.numTeams = numTeams;
    }
    public int getnumPlayers(){
       return this.numPlayers;
    }

    public void setnumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
        if (numPlayers > 19){
            System.out.println("The team has too many players");
            return;
        }

    }
    public String getteamName() {
       return this.teamName;
   }
   public void setteamName(String teamName) {
       this.teamName = teamName;
   }

    public String getstarPlayer() {
        return starPlayer;
    }
    public void setstarPlayer(String starPlayer) {
        this.starPlayer = starPlayer;
    }


    @Override
    public String toString() {
       return "How many teams=>" + numTeams+
               ", Team Name=>" + teamName +
               ", How many players=>" + numPlayers +
               ", The Star Player is =>" + starPlayer +
                ", Equipment used =>" + baseballBat;


    }

}
