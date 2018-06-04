public class App {

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper();
        char [] [] dotes = minesweeper.generateMap(5);
        minesweeper.printMap(dotes);
        int [] [] numbers = minesweeper.generateNumbers(dotes);
        minesweeper.printMap(numbers);
    }
}
