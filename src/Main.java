import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Game theGame = new Game();
        theGame.play();
        System.out.println("Thank you for playing!");
    }
}