import java.util.Random;

public class Minesweeper {

    private final char [] charArray = {'.', '.', '*'};

    public char [] [] generateMap(int rowNumber){

        char [] [] generatedMap = new char[rowNumber][rowNumber];

        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < rowNumber; j++){
                Random rand = new Random();
                generatedMap[i][j] = charArray[rand.nextInt(charArray.length)];
            }
        }

        return generatedMap;
    }

    public void printDotes(char [] [] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }
}
