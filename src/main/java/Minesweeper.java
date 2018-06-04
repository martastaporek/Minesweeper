import java.util.Random;

public class Minesweeper {

    private final char [] charArray = {'.', '.', '*', '.'};

    public char [] [] generateMap(int rowNumber){

        char [] [] generatedMap = new char [rowNumber][rowNumber];

        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < rowNumber; j++){
                Random rand = new Random();
                generatedMap[i][j] = charArray[rand.nextInt(charArray.length)];
            }
        }

        return generatedMap;
    }

    public void printMap(char [] [] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void printMap(int [] [] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }

    public int [] [] generateNumbers(char [] [] dotesMap) {

        int[][] numberMap = new int[dotesMap.length][dotesMap.length];

        for (int i = 0; i < dotesMap.length; i++) {
            for (int j = 0; j < dotesMap.length; j++) {
                int counter = 0;
                if(dotesMap[i][j] == '*'){
                    counter++;
                }
                try {
                    if (dotesMap[i][j - 1] == '*') {
                        counter++;
                    }
                } catch (IndexOutOfBoundsException e) {

                } finally {
                    try {
                        if (dotesMap[i][j + 1] == '*') {
                            counter++;
                        }
                    } catch (IndexOutOfBoundsException e) {

                    } finally {
                        try {
                            if (dotesMap[i - 1][j] == '*') {
                                counter++;
                            }
                        } catch (IndexOutOfBoundsException e) {

                        } finally {
                            try {
                                if (dotesMap[i + 1][j] == '*') {
                                    counter++;
                                }
                            } catch (IndexOutOfBoundsException e) {

                            }
                        }
                    }

                }
                numberMap[i][j] = counter;

            }
        }
        return numberMap;

    }
}
