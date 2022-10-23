package Practice;

public class Repl145 {
    private String dogName;
    private double dogWeight;
    private static String dogBreed = "Mutt";

    public Repl145(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
        System.out.println(dogName + " " + dogBreed + " " + dogWeight);
    }

}
class Repl145_Test{

    public static void main(String[] args) {
        new Repl145("Tarzan", 50);
        new Repl145("Lucy", 10);

    }
}
