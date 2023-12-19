
public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Tyson",15,110,95,40);
        Fighter fighter2 = new Fighter("Canelo" ,20, 100,98,30);

        Match match1 = new Match(fighter1,fighter2,100,90);
        match1.run();
    }
}