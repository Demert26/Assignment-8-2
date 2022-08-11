package Activity;

public class Baseball extends Sports {

     int baseBall;
     int Catcher;
     int Pitcher;


    public Baseball(int numTeams, int numPlayers, int numPositions, String teamName, String starPlayer, int baseBall, int catcher, int Pitcher) {
        super(numTeams, numPlayers, numPositions, teamName, starPlayer, true);
        this.baseBall = baseBall;
    }
    public int getbaseBall(){
        return this.baseBall;
    }

    public void setbaseBall(int baseBall){this.baseBall = baseBall;}

    public Baseball(){
        super();

    }

    public static int Position(int a, String c) { return a; }
    public static int Position(String d, int b ) {return b; }


    public void Position(){

    }


    public void Pitcher() {
        System.out.println("This is the position's number");
    }
}
