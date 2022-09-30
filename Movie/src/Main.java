class  Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No Plot in the Movie";
    }

    public String getName() {
        return name;
    }
}

class JohnWick extends Movie{
    public JohnWick(){
        super("Johnwick");
    }

    @Override
    public String lot(){
        return "John wick Kills everyone";
    }
}
class kgf extends Movie{
    public kgf(){
        super("KGF");
    }
    @Override
    public String plot() {
        return "Rocky Bhai dies in KGF";
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Movie movie = randomMovie();
            System.out.println("Movie : " + movie.getName());
            System.out.println("Plot : " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) ( Math.random() * 2) + 1;
        switch(randomNumber){
            case 1: return new kgf();
            case 2: return new JohnWick();
        }
        return null;
    }
}