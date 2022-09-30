public class Main {
    public static void main(String[] args) {
        FootballPlayer chandan = new FootballPlayer("Chandan");
        BaseballPlayer chethan = new BaseballPlayer("Chethan");
        KabbadiPlayer raj = new KabbadiPlayer("Raj");

        Team<KabbadiPlayer> rcb = new Team<>("Royal Challengers Banagalore");
          rcb.addPlayer(raj);

        Team<FootballPlayer> sydney = new Team<>("Sydney");
        sydney.addPlayer(chandan);

        Team<BaseballPlayer> uk = new Team<>("United Kingdom");
        uk.addPlayer(chethan);




    }
}