package Activity;

public class Main {

    public static void main(String[] args) {
        Sports sport = new Sports();

        sport.setnumTeams(30);
        sport.setteamName("Giants");
        sport.setnumPlayers(20);
        sport.setstarPlayer("Brandon Crawford");

        System.out.println(sport.toString() );
        System.out.println(sport.getstarPlayer());

        Baseball equipment = new Baseball();
        Baseball Positions = new Baseball();

        equipment.setbaseBall(100);
        System.out.println(equipment.baseBall);



        Baseball Giants = new Baseball(1, 15, 9, "Giants", "Buster Posey",75, 2, 1);
        Positions.Pitcher();
        System.out.println();
        System.out.println(Baseball.numPositions);

        int a = Baseball.Position(1, "Pitcher");
        int b = Baseball.Position("Catcher", 2);

        System.out.println(a);
        System.out.println(b);



    }



//    Baseball Jeter  = new Baseball();



}
