public class App {

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper();
        char [] [] dotes = minesweeper.generateMap(5);
        minesweeper.printDotes(dotes);
    }
}
