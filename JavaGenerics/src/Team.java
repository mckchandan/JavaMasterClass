import java.util.ArrayList;

public class Team<T> {
    private String name;
    int played =0,win =0,lost =0,tied =0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println("Player - " + ((Player) player).getName() + " is already in the team");
            return false;
        } else {
            members.add(player);
            System.out.println("Player - " + ((Player) player).getName() + " is added to the team");
        }
        return true;
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team Opponent,int ourScore,int theirScore){
        if(ourScore > theirScore){
            win++;
        } else if(ourScore < theirScore){
            lost++;
        } else {
            tied++;
        }
        played++;
        if(Opponent != null){
            Opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (win*2) + tied ;
    }
}
